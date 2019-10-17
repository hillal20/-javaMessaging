package com.part01javaMessaging;

public class MyApplication {

    private  MessageService mService  = new MessageService();

    public void send(String addr, String msg ){
        /// middleWARE To edit the original msg
        msg = msg + "\n **** for your eyes only  *** ";
        this.mService.sendMessage(addr, msg);
    }
}
