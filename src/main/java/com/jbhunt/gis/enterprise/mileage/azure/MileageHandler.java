package com.jbhunt.gis.enterprise.mileage.azure;

import java.util.Optional;

import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import com.jbhunt.gis.enterprise.mileage.DTO.MilesDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

public class MileageHandler extends AzureSpringBootRequestHandler<RequestDTO,MilesDTO> {

    @FunctionName("miles")
    public MilesDTO execute(
            @HttpTrigger(name = "request", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<RequestDTO>> request,
            ExecutionContext context) {
        context.getLogger().info("Input miles: " + request.getBody().get());
        return handleRequest(request.getBody().get(), context);
    }
}