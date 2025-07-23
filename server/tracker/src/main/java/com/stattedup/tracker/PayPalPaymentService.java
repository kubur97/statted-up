package com.stattedup.tracker;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        // logic to process payment
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }

}
