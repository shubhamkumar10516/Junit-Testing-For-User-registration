package com.bridgeLab.userReg;

public class UserRegistrationMain {

    public  boolean validateFirstName(String fname) {
    	
    	String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	return fname.matches(pattern);
    }
    public  boolean validateLastName(String lname) {
    	
		String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	return lname.matches(pattern);
    }
}
