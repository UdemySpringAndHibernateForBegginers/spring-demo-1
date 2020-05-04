package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    // == fields ==
    private FortuneService service;

    // == constructor ==
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor!");
    }

    // == setters ==
    public void setService(FortuneService service) {
        this.service = service;
        System.out.println("CricketCoach: inside setService setter!");
    }

    // == public methods ==
    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }
}
