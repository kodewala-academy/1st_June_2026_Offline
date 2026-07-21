package com.kodewala.payment.inf1;

public interface IBanking // 100% contract based 
{
	public static final int MAX=100; // only constant allowed
	
    public abstract void payment();
    public abstract void stopPayment();
    void suspendPayment(); // all the methods are public and abstract - by default
    public abstract void stopCheque();
    
}
