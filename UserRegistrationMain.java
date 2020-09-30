package com.bridgeLab.userReg;

public class UserRegistrationMain {

	public String analyseMood(String mood) {
		
		if(mood.contains("sad")) 
			return "SAD";
	    return "HAPPY";
	}
	
	public String checkException(String str) {
		
		try {
			
			return analyseMood(str);
		}catch(NullPointerException e) {
			return "Happy";
		}
	}
    public  boolean validateFirstName(String fname) {
    	
    	String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	return fname.matches(pattern);
    }
    
    public  boolean validateLastName(String lname) {
    	
		String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
    	
    	return lname.matches(pattern);
    }
    
    public  boolean validateEmail(String email) {
		
		
		
		//String //pattern = "^([a-zA-Z]+[a-zA-Z._0-9]*[a-zA-Z0-9]+)[@]([a-zA-Z]{2,}[.][a-zA-Z]{2,}[.][a-zA-Z]{2,})$";
		String  pattern = "^([a-z][a-zA-Z0-9\\.\\-_+]+[a-zA-Z0-9\\-_+])@([a-zA-Z0-9]{1,})\\.([a-zA-Z]{2,8})(\\.[a-z]{2,8})?$";
		return email.matches(pattern);
	}
    public  boolean validateMobile(String mobNo) {
		
		String pattern = "[0-9]{2}[ ][0-9]{10}";
		return mobNo.matches(pattern);

	}
    
   public  boolean validatePassword(String password) {
		
		String pattern = "^(?=.*[@#$%])(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}$";
		return password.matches(pattern);
	}
}
