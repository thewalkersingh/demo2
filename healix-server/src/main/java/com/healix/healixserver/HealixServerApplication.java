package com.healix.healixserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealixServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HealixServerApplication.class, args);
		printCat();
	}
	
	private static void printCat() {
		System.out.println("+----------------------------------+");
		System.out.println("|   /\\_/\\                          |");
		System.out.println("|  ( o.o )   App Started...!!      |");
		System.out.println("|   > ^ <                          |");
		System.out.println("+----------------------------------+");
	}
	
}