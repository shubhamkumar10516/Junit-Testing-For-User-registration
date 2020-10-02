package com.bridgeLab.userReg;

import com.bridgeLab.userReg.InvalidUserException.Exception_type;

public class UserRegistrationMain {

    public  boolean validateFirstName(String fname) throws InvalidUserException {
    	
    	String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	if(fname.matches(pattern)) 
    		return true;
    	
    	else throw new InvalidUserException(Exception_type.FIRST_NAME_TYPE, "Enter proper first name");
    }
    
    public  boolean validateLastName(String lname) throws InvalidUserException {
    	
		String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	if(lname.matches(pattern))
    		return true;
    	else throw new InvalidUserException(Exception_type.LAST_NAME_TYPE, "Enter valid last name");
    }
    
    public  boolean validateEmail(String email) throws InvalidUserException {
		String  pattern = "^([a-z][a-zA-Z0-9\\.\\-_+]+[a-zA-Z0-9\\-_+])@([a-zA-Z0-9]{1,})\\.([a-zA-Z]{2,8})(\\.[a-z]{2,8})?$";
		if(email.matches(pattern))
			return true;
		else throw new InvalidUserException(Exception_type.EMAIL_TYPE, "Enter proper email");
	}
    public  boolean validateMobile(String mobNo) throws InvalidUserException {
		
		String pattern = "[0-9]{2}[ ][0-9]{10}";
		if(mobNo.matches(pattern))
			return true;
		else throw new InvalidUserException(Exception_type.MOBILE_NO_TYPE, "Enter proper email");

	}
    
   public  boolean validatePassword(String password) throws InvalidUserException {
		
		String pattern = "^(?=.*[@#$%])(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}$";
		if(password.matches(pattern))
			return true;
		else throw new InvalidUserException(Exception_type.PASSWORD_TYPE, "Enter proper password");
	}
}
