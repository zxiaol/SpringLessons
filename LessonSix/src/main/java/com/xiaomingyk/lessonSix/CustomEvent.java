package com.xiaomingyk.lessonSix;

import org.springframework.context.ApplicationEvent;

/**
 * Created by My on 12/25/2016.
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source){
        super(source);
    }


    @Override
    public String toString(){
        return "My custom event";
    }
}
