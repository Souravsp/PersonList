package com.mantra.spring.web;

/**
 * Created by shaktisourav on 30/04/2017.
 */
import com.mantra.spring.model.Person;
import com.mantra.spring.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        PersonService obj = (PersonService) context.getBean("personService");
        List<Person> aList = obj.listPersons();
        for(Person p:aList)
        {
            System.out.println(p.getCountry());
        }
    }
}