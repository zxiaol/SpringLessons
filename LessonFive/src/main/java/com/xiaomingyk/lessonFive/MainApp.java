package com.xiaomingyk.lessonFive;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by My on 12/25/2016.
 */
public class MainApp {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Employee employee =  context.getBean(Employee.class);

        employee.getPerson();

        employee.setSalary(12.4f);

        employee.getSalary();

    }

}
