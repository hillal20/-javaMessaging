package com.part03InterfaceInjection;

public class EmailMessageInjector implements MessageServiceInjector {
    @Override
    public AppProcessor getProcess(){
        return new MyApplication(new EmailMessageImplementation());
    }
}
