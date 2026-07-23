package com.kodewala.payment.inf2;

public class WireTransfer implements IPaymentSystem {

	@Override
	public void pay() {
		System.out.println("WireTransfer.pay()");
		IPaymentSystem.calculatTxnFees(1000, 5);

	}

	@Override
	public void settle() {
		System.out.println("WireTransfer.settle()");

	}

	

}
