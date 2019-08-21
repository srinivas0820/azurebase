package com.jbhunt.gis.enterprise.mileage.services;

import org.springframework.stereotype.Service;

import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.ResponseDTO;

@Service
public class MileageServiceImpl implements MileageService {

	public ResponseDTO calculateMiles(RequestDTO requestDTO) {
		ResponseDTO responseDTO = new ResponseDTO();
		if (requestDTO != null) {
			responseDTO.setMessage("SUCCESS");
			responseDTO.setResponseBody("The distance between " + requestDTO.getOriginStop() + " and "
					+ requestDTO.getDestinationStop() + " is 750 miles.");
		} else {
			responseDTO.setMessage("No Input provided.");
		}
		return responseDTO;
	}
}
