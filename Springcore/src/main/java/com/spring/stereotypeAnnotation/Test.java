
package com.spring.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        
        ApplicationContext con = new ClassPathXmlApplicationContext("configstereotype.xml");
    
   Student student = con.getBean("student",Student.class);
   
  System.out.println(student);
  System.out.println(student.getAddress());
   System.out.print(student.getAddress().getClass().getName());
    System.out.println(student.hashCode());
  Student student1 = con.getBean("student",Student.class);
   
       System.out.println(student1.hashCode());
    
     // Teacher teacher = con.getBean("teacher",Teacher.class);
     /// Teacher teacher1 = con.getBean("teacher",Teacher.class);
   // releasing the concept of 
     // System.out.println(teacher.hashCode());
     // System.out.println(teacher1.hashCode());
    
    }
}