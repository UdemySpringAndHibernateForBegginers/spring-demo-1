package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    private FortuneService service;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Please run a hard 5k.";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }

    // == init method ==
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside doMyStartupStuff init method");
    }

    // == destroy method ==
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside doMyCleanupStuff destroy method");
    }

    // == destroy method for prototype bean ==
    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach: inside destroy method for prototype bean");
    }
}
