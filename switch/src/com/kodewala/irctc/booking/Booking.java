package com.kodewala.irctc.booking;

public class Booking {

	public static void bookTicket(String userType, int numberOfTickets) {
		switch (userType) {
		case "retail":
			validateBooking(userType, numberOfTickets);
			break;

		case "agent":
			validateBooking(userType, numberOfTickets);
			break;
		default:
			System.out.println(" unknown user....");
			break;
		}
	}

	private static void validateBooking(String _userType, int _numberOfTickets) {
		if (_userType.equals("retail")) {
			System.out.println(" Max ticket allowed are 6 and you have requested " + _numberOfTickets);
		} else {
			System.out.println(" User can book any number of tickets");
		}
	}

}
