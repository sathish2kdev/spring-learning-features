package com.app.profile.resttemplate.exceptionhandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ErrorResponse {

	private String timestamp;

	/** HTTP Status Code */
	private int status;

	/** HTTP Reason phrase */
	private String error;

	/** A message that describe the error thrown when calling the downstream API */
	private String message;

	/** Downstream API name that has been called by this application */
	private String api;

	/** URI that has been called */
	private String path;

	public ErrorResponse(MyRestTemplateException ex, String path) {
		this.timestamp = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now());
		this.status = ex.getStatusCode().value();
		this.error = ex.getStatusCode().getReasonPhrase();
		this.message = ex.getError();
		this.api = ex.getServiceName();
		this.path = path;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
