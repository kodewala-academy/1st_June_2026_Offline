package com.kodewala.payment;

public class Payment {
	
	// 
	private static int liveViewers=0;
	
	// fields , Attribute , data , variables
	private String paymentRefId;
	private int amount;
	private String status;
    private String response;
    
    {
    	liveViewers++;
    }
    
	public Payment(String _paymentRefId, int _amount, String _status, String _response) 
	{
		
		this.paymentRefId = _paymentRefId;
		this.amount = _amount;
		this.status = _status;
		this.response = _response;
	}
    
	public Payment( int _amount, String _status, String _response) 
	{
		
		this.amount = _amount;
		this.status = _status;
		this.response = _response;
	}
}
