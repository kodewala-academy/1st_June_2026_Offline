package com.kodewala.payment.inf4;

@FunctionalInterface
public interface MyInterface // SAM Single Abstract Method
{
     public abstract int doCalc(int a, int b); // 
    
}

/*
 * class Calc implements MyInterface
 * 
 * { // (a,b) -> a+b; lambda expression
 * 
 * @Override public int add(int a, int b) { // int sum = a + b; return sum; }
 * 
 * }
 */
