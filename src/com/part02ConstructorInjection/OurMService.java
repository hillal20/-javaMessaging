package com.part02ConstructorInjection;

public class OurMService extends MessageService {
    @Override
    public String readMessage() {
        return  " I am reading 2  ";
    }

    @Override
    public void sendMessage(String address, String message) {
        System.out.println(" ourService sendMessage  ===> add: " + address + " : " + message);

    }
}
