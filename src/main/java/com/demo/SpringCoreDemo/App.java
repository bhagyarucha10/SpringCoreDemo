package com.demo.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.SpringCoreDemo.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
       Employee e= ctx.getBean("emp1",Employee.class);
       System.out.println(e);
    }
}
