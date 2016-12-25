package com.xiaomingyk.lessonFive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by My on 12/25/2016.
 */
@Configuration
public class BeanConfig {

    @Bean
    public Person person(){

        return new Person();
    }

    @Bean
    public Employee employee(){

        return new Employee(person());
    }
}
