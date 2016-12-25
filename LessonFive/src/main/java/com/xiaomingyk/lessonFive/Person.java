package com.xiaomingyk.lessonFive;

/**
 * Created by My on 12/25/2016.
 */
public class Person {

    private String name;
    private String gender;

    public void setGender(String gender) {
        System.out.println("Setting person gender:" + gender);
        this.gender = gender;
    }

    public String getGender() {

        System.out.println("Getting person gender:" + gender);
        return gender;
    }

    public void setName(String name) {

        System.out.println("Setting person name:" + name);

        this.name = name;
    }

    public String getName() {

        System.out.println("Getting person name:" + name);

        return name;
    }

}
