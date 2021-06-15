package com.bl.userreg;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidEmailsTest {

	@Test
	public void shouldReturnTrue_ValidEmails() {
		ValidEmails obj = new ValidEmails();
		assertTrue(obj.eMail("abc@yahoo.com,"));
		assertTrue(obj.eMail("abc-100@yahoo.com,"));
		assertTrue(obj.eMail("abc.100@yahoo.com"));
		assertTrue(obj.eMail("abc111@abc.com,"));
		assertTrue(obj.eMail("abc-100@abc.net,"));
		assertTrue(obj.eMail("abc.100@abc.com.au"));
		assertTrue(obj.eMail("abc@1.com,"));
		assertTrue(obj.eMail("abc@gmail.com.com"));
		assertTrue(obj.eMail("abc+100@gmail.com"));
	}

	private void assertTrue(String eMail) {
		// TODO Auto-generated method stub

	}

}
