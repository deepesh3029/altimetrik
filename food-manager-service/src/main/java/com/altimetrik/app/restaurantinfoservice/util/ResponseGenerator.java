package com.altimetrik.app.restaurantinfoservice.util;

import java.util.Calendar;

import com.altimetrik.app.restaurantinfoservice.transport.GenericResponse;

public class ResponseGenerator {

	public static GenericResponse generateResponse(String status) {
		GenericResponse resp = new GenericResponse();
		resp.setStatus(status);
		resp.setDate(Calendar.getInstance().getTime());
		return resp;
	}

}
