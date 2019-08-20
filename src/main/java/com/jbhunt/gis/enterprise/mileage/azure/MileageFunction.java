package com.jbhunt.gis.enterprise.mileage.azure;

import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jbhunt.gis.enterprise.mileage.DTO.MilesDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;
import com.jbhunt.gis.enterprise.mileage.services.MileageService;
import com.jbhunt.gis.enterprise.mileage.services.MileageServiceImpl;
import com.microsoft.azure.functions.HttpRequestMessage;

@SpringBootApplication
public class MileageFunction {

	@Autowired
	private MileageService mileageService;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MileageFunction.class, args);
	}

	@Bean
	public MileageService getMileageService() {
		return new MileageServiceImpl();
	}

	@Bean
	public Function<HttpRequestMessage<Optional<RequestDTO>>, MilesDTO> miles() {
		return request -> mileageService.calculateMiles(request);
	}

}