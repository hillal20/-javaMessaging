package com.part03InterfaceInjection;

public class TextMessageImplementation implements MessageService {
    @Override
    public void sendMessage(String address, String message) {
        System.out.println(" Text message imp ==> :"+ address+" : " + message);
    }

    @Override
    public String readMessage() {
        return null;
    }
}
