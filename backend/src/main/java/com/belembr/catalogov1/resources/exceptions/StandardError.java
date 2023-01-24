package com.belembr.catalogov1.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Instant timestamp;
	private String status;
	private String error;
	private String message;
	private String path;
	
	
	public StandardError() {
		super();
	}


	public Instant getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
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


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public void setStatus(int value) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
