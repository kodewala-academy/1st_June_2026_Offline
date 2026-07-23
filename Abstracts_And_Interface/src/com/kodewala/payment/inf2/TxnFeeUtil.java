package com.kodewala.payment.inf2;

public class TxnFeeUtil {

	public static int calculatTxnFees(int amount, int txnPercentage) 
	{
		int txnFee = amount * txnPercentage / 100;
		return txnFee;
	}
	
}
