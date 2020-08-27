package com.altimetrik.app.restaurantinfoservice.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.app.restaurantinfoservice.transport.FailureResponse;
import com.altimetrik.app.restaurantinfoservice.transport.GenericResponse;
import com.altimetrik.app.restaurantinfoservice.util.RestaurantConstants;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public GenericResponse handleException(HttpServletResponse response) {
		FailureResponse failureResponse = new FailureResponse();
		failureResponse.setStatus(RestaurantConstants.FAILURE);
		failureResponse.setErrorMsgId("MSG-500");
		failureResponse.setErrorMsgDesc("Exception Occured.");
		response.setStatus(500);
		return failureResponse;
		
	}
	

}
