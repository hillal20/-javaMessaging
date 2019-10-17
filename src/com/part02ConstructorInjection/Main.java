package com.part02ConstructorInjection;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MyApplication myApp = new MyApplication(new OurMService());
        myApp.send("Chicago ", "hello ");

        myApp = new MyApplication(new YourMService());
        myApp.send("NYC  ", "WELCOME ");
    }
}
