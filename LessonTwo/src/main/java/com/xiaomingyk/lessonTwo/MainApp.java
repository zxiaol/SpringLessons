package com.xiaomingyk.lessonTwo;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by My on 12/24/2016.
 */
public class MainApp {

    public static void main(String[] args){

        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        TextEditor textEditor = (TextEditor)context.getBean("textEditor");

        textEditor.getSpellChecker();

        textEditor.spellCheck();

        context.registerShutdownHook();
    }
}
