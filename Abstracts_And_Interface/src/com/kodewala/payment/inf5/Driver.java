package com.kodewala.payment.inf5;

@FunctionalInterface
interface IDiscount 
{
	int apply(int amount, int disc);
}

@FunctionalInterface
interface IDiscountECom extends IDiscount
{
	 int apply(int amount, int disc);

}

public class Driver {

	public static void main(String[] args) {

		IDiscount iDiscount = (amt, dsc) -> {

			int disc = amt * dsc / 100;
			return disc;
		};

		int result = iDiscount.apply(1000, 5);
		System.out.println(result);
	}

}
