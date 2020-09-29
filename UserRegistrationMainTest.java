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
}
