package com.jbhunt.gis.enterprise.mileage.azure;


import static com.jbhunt.gis.enterprise.mileage.constants.MileageConstants.MILES_FUNCTION_NAME;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import com.jbhunt.gis.enterprise.mileage.DTO.MilesDTO;
import com.jbhunt.gis.enterprise.mileage.services.MileageService;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

/**
 * Mileage Azure Function With HttpTrigger
 */
public class MileageFunction extends AzureSpringBootRequestHandler<MilesDTO,MilesDTO> {

   @Autowired
   MileageService mileageService;
/**
 * This function listens at endpoint "/api/HttpTrigger-Java". Two ways to invoke it using "curl" command in bash:
 * 1. curl -d "HTTP Body" {your host}/ape/HttpTrigger-Java&code={your function key}
 * 2. curl "{your host}/api/HttpTrigger-Java?name=HTTP%20Query&code={your function key}"
 * Function Key is not needed when running locally, it is used to invoke function deployed to Azure.
 * More details: https://aka.ms/functions_authorization_keys
 */
    @FunctionName(MILES_FUNCTION_NAME)
    public MilesDTO run(
            @HttpTrigger(name = "req", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.FUNCTION) HttpRequestMessage<Optional<MilesDTO>> milesDTO,
            final ExecutionContext context) {
        context.getLogger().info("Java HTTP trigger processed a request."+milesDTO.toString());
        return handleRequest(milesDTO.getBody().get(),context);
    }
}
