package com.part03InterfaceInjection;

public class Main {

    public static void main(String[] args) {
        // we need to get the injector and the processor  variables
     MessageServiceInjector injector;
     AppProcessor appProcessor;

     /// lambda injector
     injector  = new LambdaMessageInjector();
     ///// getting the process
      appProcessor = injector.getProcess();
      //// sending the message
      appProcessor.sendMessage("Hello lambda  ", "lambda is  Here");
        /////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////
        injector  = new TextMessageInjector(); // inject TextMessImp into the app
        appProcessor = injector.getProcess(); // return the app processor  in which the impl was injected
        appProcessor.sendMessage("Hello Text  ", "text is  Here");
        /////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////
        injector  = new EmailMessageInjector();
        appProcessor = injector.getProcess();
        appProcessor.sendMessage("Hello Email  ", "Email is  Here");

    }
}
