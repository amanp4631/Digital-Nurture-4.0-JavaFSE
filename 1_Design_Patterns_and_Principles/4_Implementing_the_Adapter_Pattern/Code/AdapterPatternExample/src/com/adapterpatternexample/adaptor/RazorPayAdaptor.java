package com.adapterpatternexample.adaptor;

import com.adapterpatternexample.abs.PaymentProcessor;
import com.adapterpatternexample.adaptee.RazorPayGateway;

public class RazorPayAdaptor implements PaymentProcessor {
	private RazorPayGateway paypal = new RazorPayGateway();

    @Override
    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}
