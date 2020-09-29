package com.bridgeLab.userReg;

public class UserRegistrationMain {

public static boolean validateFirstName(String fname) {
    	
    	String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	return fname.matches(pattern);
    }
}
