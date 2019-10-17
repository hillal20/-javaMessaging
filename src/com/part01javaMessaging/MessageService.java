package com.part01javaMessaging;

public class MessageService {
    public void sendMessage(String address , String message){
        System.out.println("\n ==> address : "+ address +" : "+ message);
    }
    public String readMessage(){
        return "I am reading 1 ";
    }
}
