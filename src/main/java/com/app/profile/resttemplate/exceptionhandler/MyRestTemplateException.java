package com.app.profile.resttemplate.exceptionhandler;

import org.springframework.http.HttpStatus;

public class MyRestTemplateException extends RuntimeException {

	private String serviceName;
	private HttpStatus statusCode;
	private String error;
	public MyRestTemplateException(String serviceName, HttpStatus statusCode, String error) {
		super();
		this.serviceName = serviceName;
		this.statusCode = statusCode;
		this.error = error;
	}
	public String getServiceName() {
		return serviceName;
	}
	public HttpStatus getStatusCode() {
		return statusCode;
	}
	public String getError() {
		return error;
	}
}
