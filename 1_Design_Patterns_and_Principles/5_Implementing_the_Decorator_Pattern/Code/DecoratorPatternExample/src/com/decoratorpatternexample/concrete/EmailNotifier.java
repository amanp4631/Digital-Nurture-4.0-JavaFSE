package com.decoratorpatternexample.concrete;

import com.decoratorpatternexample.abs.Notifier;

public class EmailNotifier implements Notifier {
	@Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
