package com.part03InterfaceInjection;

public class TextMessageInjector implements MessageServiceInjector {
    @Override
    public AppProcessor getProcess(){
        return new MyApplication(new TextMessageImplementation());
    }
}
