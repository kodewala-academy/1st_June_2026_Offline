package com.kodewala.collection.fw.set2;

import java.util.HashSet;
import java.util.Set;

public class Driver2 
{
  public static void main(String[] args) 
  {
	Set<String> products = new HashSet<String>(); // Cap : 16, TH : 12 
	products.add("gfA");
	products.add("fghbgsfB");
	products.add("apple-bhkjhgdfC");
	products.add("sdghnbvxD");
	products.add("samsung-jhdsfaE");
	products.add("gbncvF");
	products.add("fgnbcvdG");
	products.add("lkjhgfdsH");
	products.add("oiuytrewI");
	products.add(",mnbvcxJ");
	products.add("poiuytreK");
	products.add("nbgfdeL");
	products.add("mhgrewedfgbnvdfgbngf");
	System.out.println(products);
  }
}
