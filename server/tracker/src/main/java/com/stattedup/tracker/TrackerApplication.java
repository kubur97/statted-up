package com.stattedup.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrackerApplication {

	public static void main(String[] args) {
		// this run method returns an object of type ApplicationContext
		// ApplicationContext is our IOC container that is a storage for our objects (beans)
		ApplicationContext context = SpringApplication.run(TrackerApplication.class, args);
		var orderService = context.getBean(OrderService.class);

		// instead of us manually creating objects and injecting dependencies, we let Spring do it for us by using the getBean method
		// var orderService = new OrderService(new PayPalPaymentService());

		// setters should only be used for optional dependencies
		// the order service should be able to do its job without having an external dependency
		// in this case, because the payment service is not an optional dependency, it doesn't make sense to inject it via a setter
		// constructor injection is the more common and recommended way to inject dependencies
		// orderService.setPaymentService(new PayPalPaymentService());
		
		orderService.placeOrder(); // this will process a payment of 10.0 
	}

}
