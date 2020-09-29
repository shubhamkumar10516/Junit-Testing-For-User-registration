package com.bridgeLab.userReg;

public class UserRegistrationMain {

    public static boolean validateFirstName(String fname) {
    	
    	String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	return fname.matches(pattern);
    }
    public static boolean validateLastName(String lname) {
    	
		String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	return lname.matches(pattern);
    }
    
    public static boolean validateEmail(String email) {
		
		
		
		//String //pattern = "^([a-zA-Z]+[a-zA-Z._0-9]*[a-zA-Z0-9]+)[@]([a-zA-Z]{2,}[.][a-zA-Z]{2,}[.][a-zA-Z]{2,})$";
		String  pattern = "^([a-zA-Z0-9\\.-_]+)@([a-zA-Z]{2,})\\.([a-zA-Z]{2,8})(\\.[a-z]{2,8})?$";
		return email.matches(pattern);
	}
    public static boolean validateMobile(String mobNo) {
		
		String pattern = "[0-9]{2}[ ][0-9]{10}";
		return mobNo.matches(pattern);

	}
}
