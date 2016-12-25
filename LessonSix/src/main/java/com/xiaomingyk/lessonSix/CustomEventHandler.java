package com.xiaomingyk.lessonSix;

import org.springframework.context.ApplicationListener;

import java.beans.EventHandler;

/**
 * Created by My on 12/25/2016.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
