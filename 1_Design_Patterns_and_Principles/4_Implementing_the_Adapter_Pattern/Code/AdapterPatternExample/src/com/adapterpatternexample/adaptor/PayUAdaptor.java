package com.adapterpatternexample.adaptor;

import com.adapterpatternexample.abs.PaymentProcessor;
import com.adapterpatternexample.adaptee.PayUGateway;

public class PayUAdaptor implements PaymentProcessor {
	private PayUGateway paypal = new PayUGateway();

    @Override
    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}
