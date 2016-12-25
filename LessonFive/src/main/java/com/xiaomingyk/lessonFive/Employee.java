package com.xiaomingyk.lessonFive;

import java.util.PriorityQueue;

/**
 * Created by My on 12/25/2016.
 */
public class Employee {

    private Person person;
    private String department;
    private float salary;

    public Employee(Person person){

        setPerson(person);
    }

    public void setDepartment(String department) {

        System.out.println("Set department to "+department);
        this.department = department;
    }

    public String getDepartment() {

        System.out.println("Get department  "+department);

        return department;
    }

    public void setPerson(Person person) {

        System.out.println("Set person to "+person.toString());

        this.person = person;
    }

    public Person getPerson() {

        System.out.println("Get person "+person.toString());
        return person;
    }

    public void setSalary(float salary) {

        System.out.println("Set salary to "+salary);


        this.salary = salary;
    }

    public float getSalary() {

        System.out.println("Get salary : "+salary);
        return salary;
    }
}
