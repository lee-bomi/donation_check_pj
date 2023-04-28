package com.bomilee.donation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DonationApplication {

	public static void main(String[] args) {
		System.out.println("Hello world CI2");
		SpringApplication.run(DonationApplication.class, args);
	}

}
