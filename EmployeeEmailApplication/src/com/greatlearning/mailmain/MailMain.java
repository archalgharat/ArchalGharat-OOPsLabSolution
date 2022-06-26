package com.greatlearning.mailmain;
import java.util.Scanner;

import com.greatlearning.model.EmployeeDetails;
import com.greatlearning.service.CredentialService;


public class MailMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] password;
		
		String strGenerateEmailId;
		Scanner sc = new Scanner(System.in);
		String strFirstName;
		String strLastName;
		System.out.println("Enter your first name");
		strFirstName = sc.nextLine();
		System.out.println("Enter your last name");
		strLastName = sc.nextLine();
		
		CredentialService credentialService = new CredentialService();
		EmployeeDetails empDetails = new EmployeeDetails(strFirstName,strLastName);
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		int options = sc.nextInt();
		
		if(options == 1) {
			strGenerateEmailId = credentialService.generateMailid(empDetails.getStrFirstName(), empDetails.getStrLastName(), "tech");            
			password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, password);
		}
		else if(options == 2) {
			strGenerateEmailId = credentialService.generateMailid(empDetails.getStrFirstName(), empDetails.getStrLastName(), "admin");            
			password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, password);
		}
		else if(options == 3) {
			strGenerateEmailId = credentialService.generateMailid(empDetails.getStrFirstName(), empDetails.getStrLastName(), "hr");            
			password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, password);
		}
		else if(options == 4) {
			strGenerateEmailId = credentialService.generateMailid(empDetails.getStrFirstName(), empDetails.getStrLastName(), "legal");            
			password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, password);
		}
		else {
			System.out.println("Enter Valid Option");
		}
		
		
	}

}
