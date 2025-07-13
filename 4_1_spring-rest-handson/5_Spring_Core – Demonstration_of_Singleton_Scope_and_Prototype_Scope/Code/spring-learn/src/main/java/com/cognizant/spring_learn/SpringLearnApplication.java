package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
    	ApplicationContext context = SpringApplication.run(SpringLearnApplication.class, args);
        SpringLearnApplication app = new SpringLearnApplication();
        app.displayCountry();
    }

    public void displayCountry() {
        LOGGER.info("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country singleton1 = context.getBean("singletonCountry", Country.class);
        Country singleton2 = context.getBean("singletonCountry", Country.class);

        Country prototype1 = context.getBean("prototypeCountry", Country.class);
        Country prototype2 = context.getBean("prototypeCountry", Country.class);

        LOGGER.debug("Singleton 1: {}", singleton1);
        LOGGER.debug("Singleton 2: {}", singleton2);
        LOGGER.debug("Are singleton instances same? {}", singleton1 == singleton2);

        LOGGER.debug("Prototype 1: {}", prototype1);
        LOGGER.debug("Prototype 2: {}", prototype2);
        LOGGER.debug("Are prototype instances same? {}", prototype1 == prototype2);

        LOGGER.info("END");
    }
}