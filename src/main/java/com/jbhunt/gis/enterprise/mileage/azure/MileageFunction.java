package com.jbhunt.gis.enterprise.mileage.azure;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.ResponseDTO;
import com.jbhunt.gis.enterprise.mileage.services.MileageService;

@SpringBootApplication
@ComponentScan("com.jbhunt")
public class MileageFunction {

	@Autowired
	private MileageService mileageService;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MileageFunction.class, args);
	}
	
	@Bean
	public Function<RequestDTO, ResponseDTO> miles() {
		return requestDTO -> mileageService.calculateMiles(requestDTO);
	}

}