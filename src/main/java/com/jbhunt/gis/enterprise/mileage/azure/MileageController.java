/*
 * package com.jbhunt.gis.enterprise.mileage.azure;
 * 
 * import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * 
 * import com.jbhunt.gis.enterprise.mileage.DTO.MilesDTO; import
 * com.jbhunt.gis.enterprise.mileage.DTO.RequestDTO; import
 * com.jbhunt.gis.enterprise.mileage.services.MileageService; import
 * com.microsoft.azure.functions.ExecutionContext; import
 * com.microsoft.azure.functions.HttpMethod; import
 * com.microsoft.azure.functions.HttpRequestMessage; import
 * com.microsoft.azure.functions.annotation.AuthorizationLevel; import
 * com.microsoft.azure.functions.annotation.FunctionName; import
 * com.microsoft.azure.functions.annotation.HttpTrigger;
 * 
 * public class MileageController{
 * 
 * @Autowired private MileageService mileageService;
 * 
 * @FunctionName("getMiles") public MilesDTO execute(
 * 
 * @HttpTrigger(name = "request", methods = {HttpMethod.GET, HttpMethod.POST},
 * route = "milesPost", authLevel = AuthorizationLevel.ANONYMOUS)
 * HttpRequestMessage<Optional<RequestDTO>> request, ExecutionContext context) {
 * System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>"+mileageService); return
 * mileageService.calculateMiles(request.getBody().get()); } }
 */