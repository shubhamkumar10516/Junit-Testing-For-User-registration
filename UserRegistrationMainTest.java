package com.bridgeLab.userReg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


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
        assertTrue(user.validateFirstName("Shubham"));
        assertTrue(user.validateFirstName("Shu"));
        assertFalse(user.validateFirstName("shubham"));
        assertFalse(user.validateFirstName("Sh"));
    }
    @Test
    public void validateLastNameTest()
    {
        assertTrue(user.validateLastName("Kumar"));
        assertTrue(user.validateLastName("Kum"));
        assertFalse(user.validateLastName("Ku"));
        assertFalse(user.validateLastName("kumar"));
    }
    
    @Test
    public void validateEmailTest()
    {
    	assertTrue(user.validateEmail("abc@yahoo.com"));
        assertTrue(user.validateEmail("abc-100@yahoo.com"));
        assertTrue(user.validateEmail("abc.100@yahoo.com"));
        assertTrue(user.validateEmail("abc111@abc.com"));
        assertTrue(user.validateEmail("abc-100@abc.net"));
        assertTrue(user.validateEmail("abc.100@abc.com.au"));
        
        assertTrue(user.validateEmail("123sonu@gmail.com"));
    }
    
    @Test
    public void validateMobileTest()
    {
    	assertTrue(user.validateMobile("91 2345678910"));
        assertFalse(user.validateMobile("9 1234567890"));
        assertFalse(user.validateMobile("9987654312"));
        assertFalse(user.validateMobile("+91 8765432345"));
    }
    
    @Test
    public void validatePasswordTest()
    {
    	assertFalse(user.validatePassword(" "));
        assertTrue(user.validatePassword("abcqwerF12@"));
        assertTrue(user.validatePassword("Kumar5qwert#"));
        assertFalse(user.validatePassword("ABCDEFGI"));
        assertFalse(user.validatePassword("Ku"));
        assertFalse(user.validatePassword("kumar"));
    }
    
    
    
}
