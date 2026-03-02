package com.Bean_Resolution_POC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanResolutionPocApplication implements CommandLineRunner {

	
	private final OrderService orderService;

	public BeanResolutionPocApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BeanResolutionPocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.orderService.checkout();
	}

}

// O/P is Paid Using UPI
