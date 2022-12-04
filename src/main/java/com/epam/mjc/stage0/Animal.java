package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    String getDescription(){
        String fur = hasFur ? "a":"no";
        String paws = numberOfPaws > 1 ? "paws":"paw";
        String s;
        s = "This animal is mostly " + this.color+ ". " + "It has " + this.numberOfPaws +" "+paws +" and " + fur + " fur.";
        return s;
    }
}
