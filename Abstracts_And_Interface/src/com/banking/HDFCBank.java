package com.banking;

public class HDFCBank implements IBankingSystem {

	@Override
	public void pay() {
		
		System.out.println("HDFCBank.pay()");
	}

	@Override
	public void settle() {
		
		System.out.println("HDFCBank.settle()");
	}

	@Override
	public void stopTxn() {
	System.out.println("HDFCBank.stopTxn()");
		
	}

	

}
