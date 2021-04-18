package com.yazhini;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Booking {
	public static void movietime(double Total, int NoOfSeats) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the coming date [YYYY-MM-DD]  :"); // enter the correct coming date
		String date = sc.next(); // given input is string format
		LocalDate dateConversion = LocalDate.parse(date); // input is change to integer values
		LocalDate currentDate = LocalDate.now();
		if (dateConversion.isBefore(currentDate)) {
			System.out.println("Enter the valid date :"); // it will be accept in valid date only
		}
		if ((dateConversion.isAfter(currentDate)) || (dateConversion.equals(currentDate))){
			Time(dateConversion, currentDate, Total, NoOfSeats);
		} 
			
	}

	public static void Time(LocalDate A, LocalDate B, double Total, int NoOfSeats) {
		// convert to the variables form
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"SHOW TIME : \n 1.Morning show = 10:15:00am-12:45:00pm \n 2.Evening show = 05:00:00pm-07:30:00pm \n 3.Night show = 10:00:00pm-12:30:00am \n");
		// available show in the particular mall
		System.out.println("please enter the show time [HH:MM:SS]  :");
		// choose the above details only
		String time = sc.next();
		LocalTime timeConversion = LocalTime.parse(time);
		LocalTime currentTime = LocalTime.now();

		if (A == B) {
			if (timeConversion.isBefore(currentTime)) {
				System.out.println("Enter the valid time :"); // use valid time only
			}
			if (timeConversion.isAfter(currentTime)) {
				senior.citizen(Total, NoOfSeats);
			}
			if (timeConversion == currentTime) {

				System.out.println("please wait a minutes  :"); // after enter the values waiting some time
			}
		}
		senior.citizen(Total, NoOfSeats); // next class command
	}
}
