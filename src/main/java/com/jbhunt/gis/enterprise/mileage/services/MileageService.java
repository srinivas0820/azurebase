package com.jbhunt.gis.enterprise.mileage.services;

import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.ResponseDTO;

public interface MileageService {

    public ResponseDTO calculateMiles(RequestDTO requestDTO);
}
