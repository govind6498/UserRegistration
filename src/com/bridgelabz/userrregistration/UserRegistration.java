package com.bridgelabz.userrregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void checkValidMObileNumber(String moNumber) {
		boolean ismoNumber;
		String validMoNumber="^[0-9]{2}\\s{1}[1-9]{1}[0-9]{9}";
		Pattern patternObject = Pattern.compile(validMoNumber);
		if(moNumber == null) {
			ismoNumber = false;
		}
		Matcher matcherObject = patternObject.matcher(moNumber);
		ismoNumber = matcherObject.matches();

		if(ismoNumber) {
			System.out.println(moNumber+" is an Valid MObile Number");
		}
		else {
			System.out.println(moNumber+" is an Invaid Mobile Number");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration ");
		String moNumber = "91 9798364309";
		checkValidMObileNumber(moNumber);
		moNumber = "97 0587694523";
		checkValidMObileNumber(moNumber);
	}
}
