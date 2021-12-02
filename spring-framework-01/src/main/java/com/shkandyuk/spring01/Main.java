package com.shkandyuk.spring01;

import com.shkandyuk.spring01.domain.Person;
import com.shkandyuk.spring01.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        PersonService s = context.getBean( PersonService.class );
        Person ivan = s.getByName("Ivan");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }
}
