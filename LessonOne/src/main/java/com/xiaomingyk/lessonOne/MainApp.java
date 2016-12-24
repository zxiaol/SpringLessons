package com.xiaomingyk.lessonOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by My on 12/24/2016.
 */
public class MainApp {

    public static void main(String[] args){

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld helloWorld1 = (HelloWorld)context.getBean("helloWorldS");

        helloWorld1.getMessage();

        helloWorld1.setMessage("i am in singleton mode.");

        helloWorld1.getMessage();

        HelloWorld helloWorld2 = (HelloWorld)context.getBean("helloWorldS");

        helloWorld2.getMessage();

        HelloWorld helloWorldp1 = (HelloWorld)context.getBean("helloWorldP");

        helloWorldp1.getMessage();

        helloWorldp1.setMessage("i am in prototype mode.");

        helloWorldp1.getMessage();

        HelloWorld helloWorldp2 = (HelloWorld)context.getBean("helloWorldP");

        helloWorldp2.getMessage();

        context.registerShutdownHook();


    }
}
