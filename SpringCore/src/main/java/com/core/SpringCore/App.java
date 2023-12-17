package com.core.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     /*   Coffee c = new Coffee();
        c.drink();
        Tea t = new Tea();
        t.drink(); */
    	
    /*	Beverages b = new Coffee();
    	b.drink();
    	Beverages b1 = new Tea();
    	b1.drink();*/
   //ApplicationContext interface represents the Spring IoC container that holds all the beans created by the application.
   //It is responsible for instantiating, configuring, and creating the beans.
     ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
     Beverages b = (Beverages)context.getBean("hot");
     b.drink();
     Brand br = (Brand)context.getBean("brand");
     System.out.println(br);
    }
}
