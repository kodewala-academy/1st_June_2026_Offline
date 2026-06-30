package com.kodewala;

public class DiscountCalculator {

	public static void main(String[] args) {
     discount("SILVER"); // 2100
     // calcGST(2100)
     // 
	}

	private static void discount(String type) {
		switch (type) {
		case "SILVER":
			System.out.println("DiscountCalculator.discount()... Silver");
			break;
		case "GOLD":
			System.out.println("DiscountCalculator.discount()..... GOLD");
			break;
		default:
			System.out.println("DiscountCalculator.discount().. unknow type");
			break;
		}

	}

}
