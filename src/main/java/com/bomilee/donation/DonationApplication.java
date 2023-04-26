package com.bomilee.donation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DonationApplication {

	public static void main(String[] args) {
		System.out.println("Hello world CI");
		SpringApplication.run(DonationApplication.class, args);
	}

}
