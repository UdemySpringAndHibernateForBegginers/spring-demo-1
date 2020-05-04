package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] data = new String[]{"2", "4", "6", "8"};

    @Override
    public String getFortune() {

        Random random = new Random();
        int randomIndex = random.nextInt(data.length);

        return data[randomIndex];
    }
}
