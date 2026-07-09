package com.amazon.retail.notification;

public class Notification extends Object // developer X in 2023 --> Parent class 
{
	
	// properties of its own + properties of Object
	
	public String fromAddress="test@amazon.com";
	
    public void sendNotification(String email, String from) // 500 lines
    {   	
    	System.out.println("Notification.sendNotification().. sending notification....");
    
    }
}
