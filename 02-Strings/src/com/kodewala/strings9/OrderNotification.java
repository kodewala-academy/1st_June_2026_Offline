package com.kodewala.strings9;

public class OrderNotification
{
	public String sendNotification(String name, String item, String status, String delDate) {
		StringBuilder finalMsg = new StringBuilder();
         
		// modifying and constructing the string builder
		finalMsg.append(EmailMessage.MSG1).append(name).append(EmailMessage.MSG2).append(item).append(EmailMessage.MSG3)
				.append(status).append(EmailMessage.MSG4).append(delDate);

		return finalMsg.toString();
	}

}
