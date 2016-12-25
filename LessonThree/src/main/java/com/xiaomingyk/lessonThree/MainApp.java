package com.xiaomingyk.lessonThree;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by My on 12/25/2016.
 */
public class MainApp {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Class myClass = (Class)context.getBean("class");

        myClass.getTeachers();

        myClass.getStudents();

        myClass.getLectures();

        myClass.getProperties();
    }


}
