package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.EmployeeDetails;

public class CredentialService {
	public char[] generatePassword() {
		String strCapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strSmallLetters = "abcdefghijklmnopqrstuvwxyz";
		String strNumbers = "0123456789";
		String strSpCharacters = "!@#$%^&*()_+-=";
		
		String strValues = strCapitalLetters+strSmallLetters+strNumbers+strSpCharacters;
		
		Random rd = new Random();
		
		char[] password = new char[8];		
		for(int i=0; i<8; i++) { //from 62 it will generate number 7
			password[i] = strValues.charAt(rd.nextInt(strValues.length()));//Value of H
			}
		
		return password;
	}
	
	public String generateMailid(String strFirstName, String strLastName, String strDepartment)
	{
		String strEmailId = strFirstName+strLastName+"@"+strDepartment+".abc.com";
		
		return strEmailId;
	}
	
	public void showCredentials(EmployeeDetails empDetails, String strEmailId,char[] password) {
		
		System.out.println("Dear" +" " +empDetails.getStrFirstName() + " "  + "your generated credentials are as follows");
		System.out.println("Email ---> " + strEmailId);
		System.out.println("Password ---> " +generatePassword());
		//System.out.println(generatePassword());
	}

}