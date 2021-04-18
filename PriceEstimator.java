package com.yazhini;

import java.util.Scanner;

public class PriceEstimator {
	public static void paybill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the TicketTypes :"); // enter the TicketType in the above details
		int tickettypes = sc.nextInt();
		System.out.println("Enter the NoOfSeats :"); // enter the NoOfSeats in user friendly
		int NoOfSeats = sc.nextInt();
		switch(tickettypes ) {
		case 1:{
			firstclass(NoOfSeats);
		} // if firstclass in calculate to the calling function
		case 2:{ 
			secondclass(NoOfSeats);
		} // if secondclass in calculate to the another function
		case 3:{
			thirdclass(NoOfSeats);
		} // if the thirdclass due to calling function
		default: {
			System.out.println("please enter the valid Tickettypes in above details :");
			break ;
		}
		}
		/* only enter valid TicketType 
		 * because program will be execute
		 */

	}

	public static void firstclass(int A) { /// declare to the tickettype
		double amount = (double)(A * 350); // calculate the no of seats in given tickettype
		System.out.println("Total amount of firstclass = " + amount);
		/// print the price amount will be there in the screen

		GST.calc1(amount, A); // (command) calculate the gst amount in the next class
	}

	public static void secondclass(int B) { /// declare to the tickettype
		double amount = B * 250; // calculate the no of seats in given tickettype
		System.out.println("Total amount of secondclass = " + amount);
		// print the price amount will be there in the screen
		GST.calc1(amount, B); /* it can be used in calculate
		                          the gst amount in 
		                          the next class
		                          */
	}

	public static void thirdclass(int C) { // declare to the tickettype
		double amount = C * 100; // calculate the no of seats in given tickettype
		System.out.println("Total amount of thirdclass = " + amount);
		// print the price amount wil be there in the screen

		GST.calc1(amount, C); // it can be used in calculate the gst amount in the next class
	}
}
