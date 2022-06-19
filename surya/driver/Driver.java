package com.surya.driver;

import java.util.Scanner;

import com.surya.model.Employee;
import com.surya.service.CredentialService;


public class Driver {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Surya", "Krishna");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Humanresource");
		System.out.println("4. Legal");
		
		Scanner sc =new Scanner(System.in);
		int option = sc.nextInt();
		
		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentals(employee, generatedEmail,generatedPassword);
		}
		else if (option == 2) {
				generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(),"adm");
				generatedPassword = cs.generatePassword();
				cs.showCredentals(employee, generatedEmail,generatedPassword);
			}

		else if (option == 3) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentals(employee, generatedEmail,generatedPassword);
		}

		else if (option == 4) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"lg");
			generatedPassword = cs.generatePassword();
			
			cs.showCredentals(employee, generatedEmail,generatedPassword);
		}
		
		 else
			 System.out.println("enter a valid Option");
		sc.close();
		
	}

}
