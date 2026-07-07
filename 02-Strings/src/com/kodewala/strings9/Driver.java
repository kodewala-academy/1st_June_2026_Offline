package com.kodewala.strings9;

public class Driver {

	public static void main(String[] args) {

		// declare city name for delivery
		String city = "bangalore"; //

		// sending greeting message

		OrderNotification orderNotification = new OrderNotification();

		String finalEmail = orderNotification.sendNotification("Krishna", "Samsung S20", "In-Transit", "10th July, 2026");

		System.out.println(finalEmail);
	}
}
