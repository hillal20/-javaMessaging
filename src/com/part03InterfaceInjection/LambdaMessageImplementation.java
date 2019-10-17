package com.part03InterfaceInjection;

public class LambdaMessageImplementation implements MessageService {
    @Override
    public void sendMessage(String address, String message) {
        System.out.println(" lambda mess impl ==>  :"+ address + " : "+ message);
    }

    @Override
    public String readMessage() {
        return null;
    }
}
