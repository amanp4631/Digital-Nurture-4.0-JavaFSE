package com.adapterpatternexample.adaptee;

public class RazorPayGateway {
	public void makePayment(double amount) {
        System.out.println("RazorPay: Processing payment of ₹" + amount);
    }
}
