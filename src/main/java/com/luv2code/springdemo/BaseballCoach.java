package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Please spand 30 minutes on batting practise.";
    }
}
