package com.niit.models;

public class ErrorClazz {
	private int errorCode;
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	private String errorMessage;
	
public ErrorClazz(int errorCode, String errorMessage)
{
	super();
	this.errorCode=errorCode;
	this.errorMessage=errorMessage;
}
public ErrorClazz(String errorMessage)
{
	super();
	this.errorMessage=errorMessage;
}

}
