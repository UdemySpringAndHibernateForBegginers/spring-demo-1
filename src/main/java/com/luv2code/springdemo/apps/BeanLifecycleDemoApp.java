package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.TrackCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        //retrieve bean from spring container
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //close the context
        context.close();
    }
}
