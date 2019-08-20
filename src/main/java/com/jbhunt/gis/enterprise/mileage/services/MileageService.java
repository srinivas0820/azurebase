package com.jbhunt.gis.enterprise.mileage.services;

import com.jbhunt.gis.enterprise.mileage.DTO.MilesDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;

public interface MileageService {

    public MilesDTO calculateMiles(RequestDTO requestDTO);

}
