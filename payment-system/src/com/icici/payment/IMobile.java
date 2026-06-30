package com.icici.payment;

public class IMobile {

	public void main() {

		System.out.println("IMobile.main() START");
		doPayment(1000, "0987654321", "1234567890", "5432109876");
		System.out.println("IMobile.main() END");
	}

	public static void main(String[] args) {

		System.out.println("IMobile.main() START");
		doPayment(1000, "0987654321", "1234567890", "5432109876");
		System.out.println("IMobile.main() END");
	}

	private static void doPayment(int amount, String recAccNo, String senderAccNo, String mob) {
		System.out.println("IMobile.doPayment() START");
		System.out.println(amount);
		System.out.println(recAccNo);
		System.out.println(senderAccNo);
		System.out.println(mob);

		// once txn done.. send sms
		sendSMS(mob);
		System.out.println("IMobile.doPayment() END");
	}

	private static void sendSMS(String mobile) {
		System.out.println("IMobile.sendSMS() START");
		System.out.println("IMobile.sendSMS()... txn has been done.. sending notification to mobile # " + mobile);
		System.out.println("IMobile.sendSMS() END");
	}

}
