package com.zepto.products;

public class ElectronicProduct extends Product
{
  // properties from parent (Product) +
	
	int warrantyInYears = 2;
	
	public void showWarranyDwetails()
	{
		System.out.println("ElectronicProduct.showWarranyDwetails().....");
	}
}
