package com.epam.mjc.stage0;

public class Bird extends Animal{

    Bird() {
        super("blue", 2, false);
    }

    public static void main(String[] args) {
        System.out.println(new Bird().getDescription());
    }
    @Override
    String getDescription(){
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }
}
