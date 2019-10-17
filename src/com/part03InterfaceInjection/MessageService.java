package com.part03InterfaceInjection;
// all reading must follow the rules of the 2 methods
public interface MessageService {

    //// messaging service has a sending method
    void sendMessage(String address, String message);
    //////// messaging service has reading method
    String readMessage();
}
