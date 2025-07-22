package com.stattedup.tracker;

public class OrderService {
    private PaymentService paymentService;

    // the recommended way to inject a dependency into a class is to use constructor injection
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    // in a real world application, we would place an Order object as a parameter
    public void placeOrder() {
        paymentService.processPayment(10.0); // example amount
    }
}
