package com.hotstar.users;

public class Driver {

	public static void main(String[] args) 
	{
	HotStarUser viewer1 = new HotStarUser("423dfaseasdgd");
	HotStarUser viewer2 = new HotStarUser("423dfaseasdgdfadregvdastdg", "paid");
	HotStarUser viewer3 = new HotStarUser("rfdsgwe45tfbc", "paid");
	
	System.out.println(" Total Viewers - "+HotStarUser.totalViewers);
	// call the non static method.
	viewer3.printSomething();
	}

}
