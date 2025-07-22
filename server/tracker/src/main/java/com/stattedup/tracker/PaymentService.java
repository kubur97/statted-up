package com.stattedup.tracker;

public interface PaymentService {

    // this is a method to process a payment
    // in a real world application, we would pass a Payment object that encapsulates payment info like credit card details, amount, etc.
    void processPayment(double amount);

}