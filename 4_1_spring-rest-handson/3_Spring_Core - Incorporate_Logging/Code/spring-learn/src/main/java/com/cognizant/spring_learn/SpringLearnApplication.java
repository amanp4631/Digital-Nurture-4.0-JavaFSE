package com.cognizant.spring_learn;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

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
    	
    	 ApplicationContext appContext = SpringApplication.run(SpringLearnApplication.class, args);
    	
    	LOGGER.info("START main()");
        displayDate();
        LOGGER.info("END main()");
    }

    public static void displayDate() {
        LOGGER.info("START displayDate()");
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        try {
            Date date = format.parse("31/12/2018");
            LOGGER.debug("Parsed Date {}", date);
            LOGGER.info("Is DEBUG enabled? {}", LOGGER.isDebugEnabled());


        } catch (ParseException e) {
            LOGGER.error("Error parsing date", e);
        }
        LOGGER.info("END displayDate()");
    }
}