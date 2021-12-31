package edu.spring;

import edu.spring.config.DaoConfig;
import edu.spring.config.ServicesConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import edu.spring.domain.Person;
import edu.spring.service.PersonService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//        context.register(DaoConfig.class);
//        context.register(ServicesConfig.class);
//        context.refresh();
        Person ivan = context.getBean(PersonService.class).getByName("Ivan");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }
}
