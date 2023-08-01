package com.example.demo;

public class ResponseCode {
	
	String Code;
	String Desc;
	
	
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public ResponseCode(String code, String desc) {
		super();
		Code = code;
		Desc = desc;
	}
	public ResponseCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
