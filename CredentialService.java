package com.greatlearning.dept.service;

import java.util.Random;
import java.util.Scanner;

public class CredentialService {

	public static char[] generatePassword()
	{
		int length = 8;
        String symbol = "-/.^&*_!@%=+>)"; 
        String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String small_letter = "abcdefghijklmnopqrstuvwxyz"; 
        String numbers = "0123456789";
        String finalString = numbers + cap_letter + small_letter + symbol; 
        Random random = new Random(); 

        char[] password = new char[length]; 

        for (int i = 0; i < length; i++) 
        { 
            password[i] = finalString.charAt(random.nextInt(finalString.length())); 

        } 
        return password;
	}
	public static String generateEmailAddress(String dept, Employee emp)
	{
		String email = emp.firstName+emp.lastName+"@"+dept+".abc.com";
		return email;
		
	}
	
	public static void showCredentials(String dept, Employee emp)
	{
		System.out.println("Email--->  "+generateEmailAddress(dept, emp));
		System.out.println("Password ---> "+generatePassword());
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee("Harshit", "choudary");
		System.out.println("please enter the department from the following");
		System.out.println("1. Technical \n 2. Admin\n 3. Human Resource\n 4. Legal\n");
		Scanner scan = new Scanner(System.in);
		String dept = scan.next();
		System.out.println("Dear Harshit your generated credentials are as follows");
		showCredentials(dept, emp);
	}
}
