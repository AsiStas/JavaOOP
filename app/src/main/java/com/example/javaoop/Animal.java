package com.example.javaoop;

import android.util.Log;

public abstract class Animal {
    int number0fLegs;
    boolean isAlive;

    abstract public void draw();

    public String breathe() {
        return  "I can breathe";
    }
}
