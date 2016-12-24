package com.xiaomingyk.lessonOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by My on 12/24/2016.
 */
public class MainApp {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");

        helloWorld.getMessage();
    }
}
