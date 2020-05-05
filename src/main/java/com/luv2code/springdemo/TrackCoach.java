package com.luv2code.springdemo;

public class TrackCoach implements Coach {

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
}
