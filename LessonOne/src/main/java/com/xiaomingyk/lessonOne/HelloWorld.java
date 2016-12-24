package com.xiaomingyk.lessonOne;

/**
 * Created by My on 12/24/2016.
 */
public class HelloWorld {

    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void getMessage(){

        System.out.println("Message:" + message);
    }

    public void init(){
        System.out.println("Entering Hello world");
    }


    public void destroy(){
        System.out.println("Exit Hello world");
    }
}

