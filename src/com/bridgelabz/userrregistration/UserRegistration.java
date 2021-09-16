package com.bridgelabz.userrregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void checkValidFirstName(String firstName,String lastName) {
		boolean isFirstName;
		String firstNameRegex = "[a-zA-Z] {1,}";
		String lastNameRegex = "[A-Z]{1}[a-z]{2,}";
		Pattern patternObject = Pattern.compile(lastNameRegex);
		if(lastName == null) {
			isFirstName = false;
		}
		Matcher matcherObject = patternObject.matcher(lastName);
		isFirstName = matcherObject.matches();

		if(isFirstName) {
			System.out.println(lastName+" is an Valid Last Name");
			System.exit(0);
		}
		System.out.println(lastName+" is an Invaid Last Name");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = sc.next();

		System.out.println("Enter First Name:");
		String lastName = sc.next();
		checkValidFirstName(firstName,lastName);
		
	}
}
