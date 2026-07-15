package com.kodewala.inh4;

class UserRegistration {
	// Multiple version of doRegistration method

	public void doRegistration(String mobile, int otp) // V1
	{
		System.out.println("UserRegistration.doRegistration(String mobile, int otp)");
	}

	public int doRegistration(String aadhar) // V2
	{
		System.out.println("UserRegistration.doRegistration(String aadhar)");
		return 0;
	}

	public static String doRegistration(String dl, String voterId) // V3
	{
		System.out.println("UserRegistration.doRegistration(String aadhar)");
		return "";
	}

	public static void doRegistration(int pin, String atm) // V1
	{
		System.out.println("UserRegistration.doRegistration(int pin, String atm)");
	}

}
