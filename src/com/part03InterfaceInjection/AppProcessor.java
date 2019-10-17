package com.part03InterfaceInjection;

public interface AppProcessor {
    // the processor has 2 methods reading and sending

    // sending
   void sendMessage(String add, String msg);
   // reading
    String readMessage();
}
