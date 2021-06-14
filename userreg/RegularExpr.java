package com.bl.userreg;

import java.util.Scanner;

public class RegularExpr {
	
	public void firstName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name is: ");
		String fname=sc.nextLine();
		String regexFname = "^[A-Z]{1}[a-z]{2,}";
		 
        if(fname.matches(regexFname)==true)
        {
         System.out.println("The first name "+fname+" is valid.");
        }else
        {
         System.out.println("The first name "+fname+" is invalid.");
        }
	}
	
	public void lastName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Last Name is: ");
		String lname=sc.nextLine();
		String regexFname = "^[A-Z]{1}[a-z]{2,}";
		 
        if(lname.matches(regexFname)==true)
        {
         System.out.println("The last name "+lname+" is valid.");
        }else
        {
         System.out.println("The last name "+lname+" is invalid.");
        }
	}
	
	public void eMail() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eMail is: ");
		String email=sc.nextLine();
		String regexFname = "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}([.][A-Za-z]{2})*$";
		 
        if(email.matches(regexFname)==true)
        {
         System.out.println("The eMail "+email+" is valid.");
        }else
        {
         System.out.println("The eMail "+email+" is invalid.");
        }
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the user registration.");
		RegularExpr obj=new RegularExpr();
		obj.firstName();
		obj.lastName();
		obj.eMail();
	}
}
