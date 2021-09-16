package com.bridgelabz.userrregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void checkValidEmail(String email) {
		boolean isEmail;
		String validEmail="^[a-zA-z]+[+ . -]?[0-9]*[a-zA-Z]*[@]{1}[a-zA-Z]+[.]{1}[a-zA-Z]+[.]?[a-zA-Z]*$";
		Pattern patternObject = Pattern.compile(validEmail);
		if(email == null) {
			isEmail = false;
		}
		Matcher matcherObject = patternObject.matcher(email);
		isEmail = matcherObject.matches();

		if(isEmail) {
			System.out.println(email+" is an Valid Email");
		}
		else {
			System.out.println(email+" is an Invaid Email");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration ");
		String email = "govindsingh6498@gmail.com";
		checkValidEmail(email);
		email="abc@gmail.com";
		checkValidEmail(email);
		
		email="abc@gmail.com.1a";
		checkValidEmail(email);
		email="abc@gmail.com.aa.au";
		checkValidEmail(email);
		email="abc-100@yahoo.com";
		checkValidEmail(email);
		email="abc.100@yahoo.com";
		checkValidEmail(email);
		email="abc111@abc.com";
		checkValidEmail(email);
		email="abc.100@abc.com.au";
		checkValidEmail(email);
		email="abc-100@abc.net";
		checkValidEmail(email);
		email="abc@gmail.com";
		checkValidEmail(email);
		email="abc@abc@gmail.com";
		checkValidEmail(email);
		email="abc.@gmail.com";
		checkValidEmail(email);
		email="abc..2002@gmail.com";
		checkValidEmail(email);
		email="abc@%*.com";
		checkValidEmail(email);
		email="abc()*@gmail.com";
		checkValidEmail(email);
		email=".abc@abc.com";
		checkValidEmail(email);
		email="abc123@.com.com";
		checkValidEmail(email);
		email="abc123@.com";
		checkValidEmail(email);
		email="abc+100@gmail.com ";
		checkValidEmail(email);
		email="abc123@gmail.a ";
		checkValidEmail(email);
		email="abc@.com.my";
		checkValidEmail(email);
		email="abc-100@yahoo.com";
		checkValidEmail(email);
		
		
	}
}
