package com.bridgelabz.userrregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void checkValidPasswordUpper(String passwordUpper) {
		boolean isPasswordUpper;
		String validPasswordUpper="^(?=.*[0-9])([a-zA-Z0-9]*([@#$%^&-+=()])*).{8,}$";
		Pattern patternObject = Pattern.compile(validPasswordUpper);
		if(passwordUpper == null) {
			isPasswordUpper = false;
		}
		Matcher matcherObject = patternObject.matcher(passwordUpper);
		isPasswordUpper = matcherObject.matches();

		if(isPasswordUpper) {
			System.out.println(passwordUpper+" is an Valid Password");
		}
		else {
			System.out.println(passwordUpper+" is an Invaid Password");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration ");
		String password = "akaaR#$@ou87";
		checkValidPasswordUpper(password);
		password= "hruwd%&*&%@";
		checkValidPasswordUpper(password);
		password= "hru98wd%&*&%@";
		checkValidPasswordUpper(password);
		password= "hruwd%&*&%@";
		checkValidPasswordUpper(password);
	}
}
