package com.kodewala.payment.inf6;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (a) -> a < 100;
		
		System.out.println(predicate.test(80)); // true
		System.out.println(predicate.test(120)); // false
		
		Supplier<String> supplier = () -> "Bangalore";

		System.out.println(supplier.get());
		
		Supplier<Integer> supplier2 = () -> 100000 + new Random().nextInt(900000);
		System.out.println("Your otp is : " + supplier2.get());
		
		
		Consumer<String> consumer = (emailTo) -> System.out.println(" Email has been sent : "+emailTo);
		consumer.accept("kw@gmail.com");
		
		
		Function<Integer, Integer> function = (amt) -> amt=amt-(amt*5/100);
		
		System.out.println(function.apply(100));
	}

}
