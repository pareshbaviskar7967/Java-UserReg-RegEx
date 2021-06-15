package com.bl.userreg;

import java.util.Scanner;

public class ValidEmails {
	public static String eMail(String email) {
		String regexFname = "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z0-9]{2,4}([.][A-Za-z0-9 ]{3})+,*$";
		
		if (email.matches(regexFname) == true) {
			System.out.println("The eMail " + email + " is valid.");
		} else {
			System.out.println("The eMail " + email + " is invalid.");
		}
		return email;
	}
}