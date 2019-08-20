package com.jbhunt.gis.enterprise.mileage.azure;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jbhunt.gis.enterprise.mileage.DTO.MilesDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;
import com.jbhunt.gis.enterprise.mileage.services.MileageService;
import com.jbhunt.gis.enterprise.mileage.services.MileageServiceImpl;

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
	public Function<RequestDTO, MilesDTO> miles() {
		return requestDTO -> mileageService.calculateMiles(requestDTO);
	}

}