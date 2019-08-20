package com.jbhunt.gis.enterprise.mileage.services;

import org.springframework.stereotype.Service;

import com.jbhunt.gis.enterprise.mileage.DTO.MilesDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;

@Service
public class MileageServiceImpl implements MileageService {

    public MilesDTO calculateMiles(RequestDTO requestDTO){
    	if(requestDTO.getInput()!=null) {
    	     return new MilesDTO(requestDTO.getInput(),"1000");
    	}else {
    	     return new MilesDTO("100","1000");
    	}
   
    }
}
