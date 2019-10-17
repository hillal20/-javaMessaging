package com.part03InterfaceInjection;

public class EmailMessageImplementation implements MessageService {
    @Override
    public void sendMessage(String address, String message) {
        System.out.println(" emil message imp ==> :"+ address+" : " + message);
    }

    @Override
    public String readMessage() {
        return null;
    }
}
