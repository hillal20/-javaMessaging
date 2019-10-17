package com.part03InterfaceInjection;

public class MyApplication  implements AppProcessor {
    //setting the business Rules



    //constructor injection
    private MessageService messageService;
    public MyApplication(MessageService messageServiceImplementation ){
         this.messageService = messageServiceImplementation ;

    }

    @Override
    public void sendMessage(String add, String msg){
             msg = msg + "\n **** my App : for your eyes ****";
             // invoking AppProcessor sendMessage
             this.messageService.sendMessage(add, msg);
    };
    @Override
    public String readMessage(){
        return "===>  my app is here ";
    };

}
