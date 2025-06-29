package com.decoratorpatternexample.absdecorator;

import com.decoratorpatternexample.abs.Notifier;

public abstract class NotifierDecorator implements Notifier {
	protected Notifier wrap;

    public NotifierDecorator(Notifier notifier) {
        this.wrap = notifier;
    }

    @Override
    public void send(String message) {
        wrap.send(message);
    }
}
