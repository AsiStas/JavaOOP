package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat {

    public Lion(){
        //super();
        Log.i("constructor", "Constructor Lion()");
    }

    public static String whatCatsLike(){
        return  "I'm lion and i like playing, jumping and sometimes scratching";
    }

    @Override
    public void draw() {

    }
}