package com.part02ConstructorInjection;

public class MyApplication {

    private MessageService messageService;

    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String addr, String msg ){
        /// middleWARE To edit the original msg
        msg = msg + "\n **** for your eyes only  *** ";
        this.messageService.sendMessage(addr, msg);
    }
}
