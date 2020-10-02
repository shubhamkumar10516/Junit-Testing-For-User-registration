package com.bridgeLab.userReg;

public class InvalidUserException extends Exception {
	
	enum Exception_type{
		FIRST_NAME_TYPE, LAST_NAME_TYPE, MOBILE_NO_TYPE, PASSWORD_TYPE, EMAIL_TYPE 
	}
	Exception_type type;
	public InvalidUserException(Exception_type type , String message) {
		super(message);
		this.type = type; 
	}

}
