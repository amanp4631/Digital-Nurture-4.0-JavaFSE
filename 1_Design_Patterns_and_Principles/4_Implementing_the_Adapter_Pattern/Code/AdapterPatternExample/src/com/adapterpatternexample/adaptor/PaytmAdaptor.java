package com.adapterpatternexample.adaptor;

import com.adapterpatternexample.abs.PaymentProcessor;
import com.adapterpatternexample.adaptee.PaytmGateway;

public class PaytmAdaptor implements PaymentProcessor {
	private PaytmGateway paypal = new PaytmGateway();

    @Override
    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}
