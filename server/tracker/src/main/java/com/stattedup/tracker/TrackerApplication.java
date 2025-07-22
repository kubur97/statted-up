package com.stattedup.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrackerApplication {

	public static void main(String[] args) {
		// SpringApplication.run(TrackerApplication.class, args);
		var orderService = new OrderService(new PayPalPaymentService());
		orderService.placeOrder(); // this will process a payment of 10.0 
	}

}
