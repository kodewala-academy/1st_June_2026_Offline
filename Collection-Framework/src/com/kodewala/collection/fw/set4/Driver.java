package com.kodewala.collection.fw.set4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args)
	{
		Set<String> cities = new LinkedHashSet<String>();
        cities.add("BLR");
        cities.add("GGN");
        cities.add("DL");
        cities.add("HYD");
        cities.add("HYD");
        cities.add("CHE");
        cities.add(null);
        cities.add(null);
        // reading
        System.out.println(cities.contains("CHE")); // identify the bucket --> 5th --> 
        System.out.println(cities);
	}

}
