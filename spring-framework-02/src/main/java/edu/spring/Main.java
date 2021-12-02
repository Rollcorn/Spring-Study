package edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import edu.spring.domain.Person;
import edu.spring.service.PersonService;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = null;

        PersonService service = context.getBean(PersonService.class);

        Person ivan = service.getByName("Ivan");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }
}
