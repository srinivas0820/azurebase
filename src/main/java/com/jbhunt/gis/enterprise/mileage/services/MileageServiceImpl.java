package com.jbhunt.gis.enterprise.mileage.services;

import com.jbhunt.gis.enterprise.mileage.DTO.MilesDTO;
import org.springframework.stereotype.Component;

@Component
public class MileageServiceImpl implements MileageService {

    public MilesDTO calculateMiles(){
        return new MilesDTO();
    }
}
