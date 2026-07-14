package com.kodewala.inh3;

class Parent
{
	
}
class Child extends Parent
{
	
}

public class Driver {

	public static void main(String[] args) 
	{
	     Parent p1 = new Parent();
	     
	     Parent p2 = (Parent) new Child();
	     
	     Child c1 =(Child) new Parent();

	}

}
