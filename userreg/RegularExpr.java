package com.bl.userreg;

import java.util.Scanner;

public class RegularExpr {
	
	public void userRegistration() {
		Scanner sc=new Scanner(System.in);
		System.out.println("The First Name is: ");
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
	public static void main(String[] args) {
		System.out.println("Welcome to the user registration.");
		RegularExpr obj=new RegularExpr();
		obj.userRegistration();
	}
}
