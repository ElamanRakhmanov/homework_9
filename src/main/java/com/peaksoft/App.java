package com.peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat = context.getBean("cat", Cat.class);
        Dog dog = context.getBean("dog", Dog.class);
        Person person = context.getBean("Person", Person.class);
        Person person2 = context.getBean("Person2", Person.class);

        System.out.println(person.getName() + " " + dog);
        System.out.println(person2.getName() + " " + cat);


    }
}
