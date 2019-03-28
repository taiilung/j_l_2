package com.company;

import java.util.Random;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String name = "Ilon";
            int temp = 31;
        Random generator = new Random();
        int age = generator.nextInt(107);
        System.out.println("Возраст человека - " + age);
        System.out.println("Температура на улице - " + temp);

        if (age > 20 && age < 45) {
            if (temp > 30 || temp < -20) {
                System.out.println("Не выходите гулять");
            } else {
                System.out.println("Можете отправляться в гости к своему другу");
            }
        }
//        else if (age < 20){
//
//        }
    }
}