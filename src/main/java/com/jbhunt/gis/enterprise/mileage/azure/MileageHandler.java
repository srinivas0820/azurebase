package com.jbhunt.gis.enterprise.mileage.azure;

import java.util.Optional;

import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;
import org.springframework.stereotype.Component;

import com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO;
import com.jbhunt.gis.enterprise.mileage.DTO.ResponseDTO;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

@Component
public class MileageHandler extends AzureSpringBootRequestHandler<RequestDTO, ResponseDTO> {

	@FunctionName("miles")
	public ResponseDTO execute(@HttpTrigger(name = "request", methods = { HttpMethod.GET,
			HttpMethod.POST }, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<RequestDTO>> request,
			ExecutionContext context) {
		if (request.getBody().isPresent()) {
			return handleRequest(request.getBody().get(), context);
		} else {
			return handleRequest(null, context);
		}

	}
}