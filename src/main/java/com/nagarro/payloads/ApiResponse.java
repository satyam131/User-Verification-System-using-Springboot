package com.nagarro.payloads;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

	String message;
	String code;
	String timestamp;
	public String getMessage() {
		return message;
	}
	public String getCode() {
		return code;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
