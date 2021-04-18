package com.yazhini;

public class GST {
	public static void calc1(double  amount, int NoOfSeats) {
		double GST =(double) 7 * (amount / 100); /// math of the gst in the travel amount
		double Total = GST + amount; // (amount and gst) it must be added
		System.out.println("~~~~~~~~~~~~~~TOTAL AMOUNT~~~~~~~~~~~~~~");
		System.out.println("PRICE AMOUNT =" + amount); // display the price amount only
		System.out.println("GST AMOUNT   =" + GST); // gst amount only printed in the screen
		System.out.println("TOTAL AMOUNT=" + Total); // overall total bill amount is validate

		Booking.movietime(Total, NoOfSeats);

	}
}