package com.amazon.reseller.notification;

import com.amazon.retail.notification.Notification;

// notify the reseller when stock is less.

public class ResellerNotification  extends Notification // Child class      // developer Y
{
	// its own prop + Notification prop + Object class

	public static void main(String[] args)
	{
		ResellerNotification notification = new ResellerNotification();
		
		System.out.println(notification.fromAddress); // from parent class we are reusing it 
		
		notification.sendNotification("ajay@gmail.com", "no-reply@amazon.com"); // from parent class we are reusing it 
	
		System.out.println(notification.hashCode()); // reusing the hashCode()
	
	}
	
	
}
