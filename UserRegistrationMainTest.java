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
    	assertTrue(user.validateEmail("shubham.kum@gmail.com"));
        assertTrue(user.validateEmail("shubham.kum@gmail.co.in"));
        assertFalse(user.validateEmail("sh12.kum1@12cap.com"));
        assertFalse(user.validateEmail("shu.kuma@.com"));
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
        assertTrue(user.validatePassword("abcqwerf"));
        assertTrue(user.validatePassword("Kumarqwert"));
        assertFalse(user.validatePassword("Ku"));
        assertFalse(user.validatePassword("kumar"));
    }
    
    
    
}
