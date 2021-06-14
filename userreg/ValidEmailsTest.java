package com.bl.userreg;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidEmailsTest {
	
	ValidEmails obj=new ValidEmails();
	String email = "abc";
	@Test
	public void shouldReturnTrue_firstName() {
		String str = obj.eMail(email);
		assertTrue(str);
	}
	private void assertTrue(String str) {
		// TODO Auto-generated method stub
		
	}
}
