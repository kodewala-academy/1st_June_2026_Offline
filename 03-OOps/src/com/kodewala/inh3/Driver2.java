package com.kodewala.inh3;

class Delivery {
	public Post doDeliver() 
	{
		System.out.println("Delivery.doDeliver()");
		return new Post();
	}

}

class OneDayDelivery extends Delivery 
{
	@Override
	public SpeedPost doDeliver() 
	{
		System.out.println("OneDayDelivery.doDeliver()");
		return new SpeedPost();
	}
}

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
