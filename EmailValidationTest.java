package com.bridgeLab.userReg;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgeLab.userReg.InvalidUserException.Exception_type;

@RunWith(Parameterized.class)
public class EmailValidationTest {

	private String email;
	private boolean expectedOp;
	
	public EmailValidationTest(String email ,boolean expectedOp ) {
		this.email = email;
		this.expectedOp = expectedOp;
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList( new Object[][] {
			{"abc@yahoo.com", true},
			{"abc-100@yahoo.com", true},
			{"abc.100@yahoo.com", true},
			{"abc111@abc.com", true},
			{"abc-100@abc.net", true},
			{"abc.100@abc.com.au", true},
			{"abc@1.com", true},
			{"abc@gmail.com.com", true},
			{"abc+100@gmail.com", true},
			{"abc@.com.my", false},
			{"abc123@gmail.a", false},
			{"abc@abc@gmail.com", false},
			{" abc@%*.com", false},
			{"abc123@.com", false},
			{"abc123@.com.com", false},
			{".abc@abc.com", false},
			{"abc()*@gmail.com", false},
			{"abc.2002@gmail..com", false},
			{"abc.@gmail.com", false},
			{"abc@gmail.com.1a", false},
			{"abc@gmail.com.aa.au", false}
		});
				
	}
	
	@Test
	public void testEmailValidationtest() {
		UserRegistrationMain validateUser = new UserRegistrationMain();
		//boolean result = 
		try {
		    validateUser.validateEmail.validate(this.email);
		}catch(InvalidUserException e) {
			Assert.assertEquals(Exception_type.EMAIL_TYPE, e.type);
		}
		//Assert.assertEquals(expectedOp, result);
	}
}
