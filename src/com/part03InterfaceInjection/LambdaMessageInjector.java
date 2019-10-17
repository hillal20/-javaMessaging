package com.part03InterfaceInjection;

public class LambdaMessageInjector implements MessageServiceInjector {
    @Override
    public AppProcessor getProcess(){
        return new MyApplication(new LambdaMessageImplementation());
    }
}
