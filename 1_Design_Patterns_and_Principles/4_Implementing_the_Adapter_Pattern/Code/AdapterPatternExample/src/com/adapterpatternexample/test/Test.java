package com.adapterpatternexample.test;

import com.adapterpatternexample.abs.PaymentProcessor;
import com.adapterpatternexample.adaptor.PayUAdaptor;
import com.adapterpatternexample.adaptor.PaytmAdaptor;
import com.adapterpatternexample.adaptor.RazorPayAdaptor;

public class Test {
	public static void main(String[] args) {
        PaymentProcessor paytmProcessor = new PaytmAdaptor();
        PaymentProcessor payuProcessor = new PayUAdaptor();
        PaymentProcessor razorpayProcessor = new RazorPayAdaptor();
        

        paytmProcessor.processPayment(999.0);
        payuProcessor.processPayment(1350.0);
        razorpayProcessor.processPayment(239.0);
    }

}
