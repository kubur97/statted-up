package com.stattedup.tracker;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    // the recommended way to inject a dependency into a class is to use constructor injection
    // the Autowired annotation isn't required if the class has only one constructor
    // if we had multiple constructors, we would use @Autowired 
    // @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // in a real world application, we would place an Order object as a parameter
    public void placeOrder() {
        paymentService.processPayment(10.0); // example amount
    }

     public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
