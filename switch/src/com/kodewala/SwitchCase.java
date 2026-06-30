package com.kodewala; // first line of you java code

public class SwitchCase {

	public static void main(String[] args) {

		System.out.println("SwitchCase.main()");

		int day = Integer.parseInt(args[0]);

		String output = SwitchCase.indentifyDay(day);
		System.out.println(output);
	}

	public static String indentifyDay(int number) {
		String day = null;

		switch (number) {
		case 1:
			day = "MON";
			break;
		case 2:
			day = "TUE";
			break;
		case 3:
			System.out.println(" day is wed...");
			day = "WED";
			break;
		case 4:
			day = "TH";
			break;
		case 5:
			day = "FRI";
			break;
		case 6:
			day = "SAT";
			break;
		case 7:
			day = "SUN";
			break;
		default:
			day = "unknown";
		}
		return day;
	}

}
