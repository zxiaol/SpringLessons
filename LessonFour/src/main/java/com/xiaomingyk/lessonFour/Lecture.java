package com.xiaomingyk.lessonFour;

import java.util.*;

/**
 * Created by My on 12/25/2016.
 */
public class Lecture {

    private String name;
    private Set classTimes;

    public void setName(String name) {

        System.out.println("Setting lecture name:"+name);
        this.name = name;
    }

    public String getName() {

        System.out.println("Getting lecture name:"+name);

        return name;
    }

    public void setClassTimes(Set classTimes) {

        System.out.println("Setting class time:" + classTimes.toString());
        this.classTimes = classTimes;
    }

    public Set getClassTimes() {

        System.out.println("Getting class times: "+classTimes.toString());
        return classTimes;
    }
}
