package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        Coach betaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean result = alphaCoach == betaCoach;

        //print result
        System.out.println("Pointing to the same object? -> " + result);
        System.out.println("Memory location for alphaCoach" + alphaCoach);
        System.out.println("Memory location for betaCoach" + betaCoach);

        //close the context
        context.close();
    }
}
