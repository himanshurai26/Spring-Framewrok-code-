/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Himanshu Kumar
 */
public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("configautowiring.xml");
    
     A a = (A) context.getBean("a");
      Address address = (Address)context.getBean("address");
      
      System.out.println(address);
      
      
    a.display();
     
     Emp  emp = context.getBean("emp1", Emp.class);
     
     System.out.println(emp);
            
    
    }
    
}
