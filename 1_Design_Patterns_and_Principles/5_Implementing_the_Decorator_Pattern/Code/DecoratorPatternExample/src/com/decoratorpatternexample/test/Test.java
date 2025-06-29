package com.decoratorpatternexample.test;

import com.decoratorpatternexample.abs.Notifier;
import com.decoratorpatternexample.concrete.EmailNotifier;
import com.decoratorpatternexample.decorator.SMSNotifierDecorator;
import com.decoratorpatternexample.decorator.SlackNotifierDecorator;

public class Test {

	public static void main(String[] args) {
		Notifier notifier = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                    new EmailNotifier()
                )
             );

		notifier.send("System Alert: High Memory Usage");
	}

}
