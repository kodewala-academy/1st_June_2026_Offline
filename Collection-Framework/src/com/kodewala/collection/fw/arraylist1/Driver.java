package com.kodewala.collection.fw.arraylist1;

import java.util.ArrayList;

/**
 * @author Dev-2
 */
public class Driver {

	public static void main(String[] args) {
		CityService cityService = new CityService();

		// Getting city Names
		ArrayList<String> cities = cityService.getCityNames();

		// Process it(Task - Find the city name stating with 'm')
		// remove the first element
		cities.get(0); // 
		
		for(String city : cities)
		{
			if(city.startsWith("M"))
			{
				System.out.println(city);
			}
		}
	}

}
