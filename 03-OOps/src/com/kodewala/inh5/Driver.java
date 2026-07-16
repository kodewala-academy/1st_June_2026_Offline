package com.kodewala.inh5;
class Notification
{
	public void sendNotification()
	{
		System.out.println("Notification.sendNotification()-- Sending notification");
	}
}

class EmailNotification extends Notification
{
	@Override
	public void sendNotification()
	{
		System.out.println("EmailNotification.sendNotification() --- Sending email Notification");
	}
	
	
}

class SmsNotification extends Notification
{
	@Override
	public void sendNotification()
	{
		System.out.println("SmsNotification.sendNotification() --- Sending SMS Notification");
	}
}

class WhatsAppNotification extends Notification
{
	@Override
	public void sendNotification()
	{
		System.out.println("WhatsAppNotification.sendNotification() --- WhatsAppNotification ");
	}
}


public class Driver {

	public static void main(String[] args) 
	{
		Notification n0 = new Notification();
		
		// Compile time : sendNotification() in Notification class
		// Runtime : calls the sendNotification() of Notification
		n0.sendNotification(); 
		
		
		Notification n1 = new EmailNotification(); // Parent class referring child class object.
		
		// Compile time : sendNotification() in Notification class
		// Runtime : calls the sendNotification() of EmailNotification
		n1.sendNotification();
		
		Notification n2 = new SmsNotification(); // Parent class referring child class object.
		
		// Compile time : sendNotification() in Notification class
		// Runtime : calls the sendNotification() of SmsNotification
		n2.sendNotification(); // Which method to call ? --> decision happens at runtime --> runtime polymorphism
	}

}
