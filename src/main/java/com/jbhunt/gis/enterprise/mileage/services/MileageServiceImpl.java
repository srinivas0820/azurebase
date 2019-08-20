package com.jbhunt.gis.enterprise.mileage.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jbhunt.gis.enterprise.mileage.DTO.MilesDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;
import com.microsoft.azure.functions.HttpRequestMessage;

@Service
public class MileageServiceImpl implements MileageService {

    public MilesDTO calculateMiles(HttpRequestMessage<Optional<RequestDTO>> request ){
    
    	if(request.getBody().isPresent()) {
    		RequestDTO requestDTO = request.getBody().get();
    	     return new MilesDTO(requestDTO.getInput(),"1000");
    	}else {
    	     return new MilesDTO("100","1000");
    	}
   
    }
}
