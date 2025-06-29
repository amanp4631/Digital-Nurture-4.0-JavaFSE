package com.decoratorpatternexample.decorator;

import com.decoratorpatternexample.abs.Notifier;
import com.decoratorpatternexample.absdecorator.NotifierDecorator;

public class SlackNotifierDecorator extends NotifierDecorator {
	public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Slack: " + message);
    }

}
