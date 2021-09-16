package com.bridgelabz.userrregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void checkValidPassword(String password) {
		boolean isPassword;
		String validPassword="^([a-zA-Z0-9]*[\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\+\\.]*){8,}$";
		Pattern patternObject = Pattern.compile(validPassword);
		if(password == null) {
			isPassword = false;
		}
		Matcher matcherObject = patternObject.matcher(password);
		isPassword = matcherObject.matches();

		if(isPassword) {
			System.out.println(password+" is an Valid Password");
		}
		else {
			System.out.println(password+" is an Invaid Password");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration ");
		String password = "@9197983*64309";
		checkValidPassword(password);
		password= "97 058769#452)3";
		checkValidPassword(password);
	}
}
