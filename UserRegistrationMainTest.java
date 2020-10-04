package com.bridgeLab.userReg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bridgeLab.userReg.InvalidUserException.Exception_type;


public class UserRegistrationMainTest 
{
	UserRegistrationMain user = null;
	@Before
	public void initialize() {
		user = new UserRegistrationMain();
	}
	
    @Test
    public void validateFirstNameTest()
    {
    	
        try {
        	user.uFirstName.validate("Shubham");
        }catch(InvalidUserException e) {
        	assertEquals(Exception_type.FIRST_NAME_TYPE, e.type);
        }
    	
    }
    @Test
    public void validateLastNameTest()
    {
    	try {
        	user.uLastName.validate("Kumar");
        }catch(InvalidUserException e) {
        	assertEquals(Exception_type.LAST_NAME_TYPE, e.type);
        }
    }
    
    @Test
    public void validateEmailTest()
    {
    	try {
    	    user.validateEmail.validate("abc@yahoo.com");
    	}catch(InvalidUserException e) {
    		assertEquals(Exception_type.EMAIL_TYPE, e.type);
    	}
    }
    
    @Test
    public void validateMobileTest()
    {
    	try {
    		user.validateMobile.validate("91 2345678910");
    	}catch(InvalidUserException e) {
    		assertEquals(Exception_type.MOBILE_NO_TYPE, e.type);
    	}
    }
    
    @Test
    public void validatePasswordTest()
    {
    	try {
    	    user.validatePassword.validate("abcqwerF12@");
    	}catch(InvalidUserException e) {
    		assertEquals(Exception_type.PASSWORD_TYPE, e.type);
    	}
    }
}
