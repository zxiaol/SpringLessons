package com.xiaomingyk.lessonSix;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by My on 12/25/2016.
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher){

        this.publisher = publisher;

    }

    public void publish(){

        CustomEvent e = new CustomEvent(this);
        publisher.publishEvent(e);
    }
}
