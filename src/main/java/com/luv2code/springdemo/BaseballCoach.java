package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService service;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Please spand 30 minutes on batting practise.";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }
}
