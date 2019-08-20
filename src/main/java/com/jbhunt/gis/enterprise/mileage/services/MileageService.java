package com.jbhunt.gis.enterprise.mileage.services;

import java.util.Optional;

import com.jbhunt.gis.enterprise.mileage.DTO.MilesDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;
import com.microsoft.azure.functions.HttpRequestMessage;

public interface MileageService {

    public MilesDTO calculateMiles(HttpRequestMessage<Optional<RequestDTO>> requestDTO);
}
