package com.decoratorpatternexample.decorator;

import com.decoratorpatternexample.abs.Notifier;
import com.decoratorpatternexample.absdecorator.NotifierDecorator;

public class SMSNotifierDecorator extends NotifierDecorator {
	public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS: " + message);
    }
}
