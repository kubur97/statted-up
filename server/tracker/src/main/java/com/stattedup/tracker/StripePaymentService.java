package com.stattedup.tracker;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripePaymentService")
@Primary
public class StripePaymentService implements PaymentService {
    // this is a method to process a payment
    // in a real world application, we would pass a Payment object that encapsulates payment info like credit card details, amount, etc.
    @Override
    public void processPayment(double amount) {
        // logic to process payment
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
