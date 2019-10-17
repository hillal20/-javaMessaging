package com.part02ConstructorInjection;

public class YourMService  extends   MessageService{
    @Override
    public String readMessage() {
       return  " I am reading 3";
    }

    @Override
    public void sendMessage(String address, String message) {
        System.out.println(" yourService sendMessage ===> add: " + address + " : " + message);

    }
}
