package com.xiaomingyk.lessonWebException.controller;

import com.xiaomingyk.lessonWebException.model.Student;
import com.xiaomingyk.lessonWebException.model.StudentException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by My on 1/12/2017.m
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student(){

        return new ModelAndView("student", "command", new Student());

    }
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    @ExceptionHandler({StudentException.class})
    public String addStudent( @ModelAttribute("HelloWeb")Student student,
                              ModelMap model) {

        if(student.getName().length() < 5 ){
            throw new StudentException("Given name is too short");
        }else{
            model.addAttribute("name", student.getName());
        }

        if( student.getAge() < 10 ){
            throw new StudentException("Given age is too low");
        }else{
            model.addAttribute("age", student.getAge());
        }
        model.addAttribute("id", student.getId());
        return "result";
    }
}
