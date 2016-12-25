package com.xiaomingyk.lessonThree;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by My on 12/25/2016.
 */
public class Class {

    private List<Person> students;
    private Set<Person> teachers;
    private Map<Lecture,Person> lectures;
    private Properties properties;

    public void setStudents(List<Person> personList){

        System.out.println("Setting students.");

        students = personList;
    }


    public List<Person> getStudents(){

        System.out.println("Getting students."+ students.toString());

        return students;
    }

    public void setTeachers(Set<Person> personList){

        System.out.println("Setting teachers.");

        teachers = personList;
    }


    public Set<Person> getTeachers(){

        System.out.println("Getting teachers."+teachers.toString());

        return teachers;
    }

    public void setLectures(Map<Lecture,Person> lectures){

        System.out.println("Setting lectures.");

        this.lectures = lectures;
    }


    public Map<Lecture,Person> getLectures(){

        System.out.println("Getting lectures." + lectures.toString());

        return lectures;
    }

    public void setProperties(Properties properties){

        System.out.println("Setting properties.");

        this.properties = properties;
    }


    public Properties getProperties(){

        System.out.println("Getting properties." + properties.toString());

        return properties;
    }

}
