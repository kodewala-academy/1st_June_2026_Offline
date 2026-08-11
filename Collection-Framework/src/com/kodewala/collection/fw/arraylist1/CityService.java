package com.kodewala.collection.fw.arraylist1;

import java.util.ArrayList;
/**
 * @author Dev-1
 */
public class CityService {

	public ArrayList<String> getCityNames() {
		
		// I want to Store the city names(MAY be duplicate) (Storage - 1000 cities)
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Bangalore");
		cities.add("Hyderabad");
		cities.add("Mumbai");
		cities.add("Chennai");
		cities.add("Mysore");
		cities.add("Mumbai");

		return cities;
	}

}
