package com.adapterpatternexample.adaptee;

public class PayUGateway {
	public void makePayment(double amount) {
        System.out.println("PayU: Processing payment of ₹" + amount);
    }
}
