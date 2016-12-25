package com.xiaomingyk.lessonSix;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by My on 12/25/2016.
 */
public class MainApp {

    public static void main(String[] args){

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CustomEventPublisher publisher = (CustomEventPublisher)context.getBean("customEventPublisher");
        publisher.publish();
        publisher.publish();

    }

}
