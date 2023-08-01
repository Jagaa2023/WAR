package com.example.demo;

import java.util.List;

public class Response {
	
	ResponseCode responseHeader;
	List<ProfileMode> responseBody;
	public ResponseCode getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(ResponseCode responseHeader) {
		this.responseHeader = responseHeader;
	}
	public List<ProfileMode> getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(List<ProfileMode> responseBody) {
		this.responseBody = responseBody;
	}
	public Response(ResponseCode responseHeader, List<ProfileMode> responseBody) {
		super();
		this.responseHeader = responseHeader;
		this.responseBody = responseBody;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	
	

}
