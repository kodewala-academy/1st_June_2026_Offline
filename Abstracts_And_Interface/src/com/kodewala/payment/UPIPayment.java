package com.kodewala.payment;

public class UPIPayment extends PaymentSystem {

	@Override
	public void pay() {
		System.out.println("UPIPayment.pay()");

	}

	@Override
	public void suspendPayment() {
		System.out.println("UPIPayment.suspendPayment()");

	}

	@Override
	public void stopPayment() {
		System.out.println();

	}

	@Override
	public void checkLimit() {
		System.out.println("UPIPayment.checkLimit()");

	}

}
