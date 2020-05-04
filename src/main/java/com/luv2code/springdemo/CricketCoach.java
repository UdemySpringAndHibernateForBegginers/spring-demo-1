package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    // == fields ==
    private FortuneService service;
    private String email;
    private String team;

    // == constructor ==
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor!");
    }

    // == getters ==
    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    // == setters ==
    public void setService(FortuneService service) {
        this.service = service;
        System.out.println("CricketCoach: inside setService setter!");
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("CricketCoach: inside setEmail setter!");
    }

    public void setTeam(String team) {
        this.team = team;
        System.out.println("CricketCoach: inside setTeam setter!");
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
