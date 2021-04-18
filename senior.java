package com.yazhini;

import java.time.LocalDate;
import java.util.Scanner;

public class senior {
	public static void citizen(double Total, int NoOfSeats) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your DOB :[YYYY-MM-DD] "); // enter the date of birth
		String DOB = sc.next();
		LocalDate DOBString = LocalDate.parse(DOB); // convert to the dob
		LocalDate currentDate = LocalDate.now();
		int type1 = DOBString.getYear();
		int type2 = currentDate.getYear();
		int age = (type2 - type1); // substraction of old year to current year
		if (age > 60) {
			float type3 = (float)(Total / 100) * 50;
			System.out.println("you are the SENIOR CITIZEN so your bill amount is :" + type3);
			// type 3 is succeed then you are a senior citizen
		} else
			System.out.println("you are not a SENIOR CITIZEN so your bill amount is :" + Total);
		// Total is succeed then you are not a senior citizen
	}

}
