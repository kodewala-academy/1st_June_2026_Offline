package com.kodewala.payment.inf2;

public interface IPaymentSystem 
{
   void pay();
   void settle();
   
   public default void checkBalance()
   {
	   connectToDB();
	   System.out.println("IPaymentSystem.checkBalance()");
   }
   
   // from java 8 onwards, you can write static methods inside interface.
   public static int calculatTxnFees(int amount, int txnPercentage) 
	{
	   connectToDB();
		int txnFee = amount * txnPercentage / 100;
		return txnFee;
	}
 
   public static int calculatConvFees(int amount, int txnPercentage, String type) 
	{
	    connectToDB();
		int txnFee = amount * txnPercentage / 100;
		return txnFee;
	}
   
   private static void connectToDB()
   {
	// 20 lines of code  ---> database connection logic
   }
}
