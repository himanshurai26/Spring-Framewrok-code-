
package com.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args){
    
   //System.out.print("Created by Himanshu kumar");
   
   ApplicationContext  context = new ClassPathXmlApplicationContext("config.xml");
   Student student = (Student)context.getBean("student1");
   Student student1 =(Student)context.getBean("student2");
   
   
   
   System.out.println(student);
   System.out.println(student1);
}

}
