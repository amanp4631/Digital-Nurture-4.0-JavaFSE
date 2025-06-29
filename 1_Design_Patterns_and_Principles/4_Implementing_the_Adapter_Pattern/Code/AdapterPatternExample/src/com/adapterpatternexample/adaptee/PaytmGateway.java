package com.adapterpatternexample.adaptee;

public class PaytmGateway {
	public void makePayment(double amount) {
        System.out.println("Paytm: Processing payment of ₹" + amount);
    }
}
