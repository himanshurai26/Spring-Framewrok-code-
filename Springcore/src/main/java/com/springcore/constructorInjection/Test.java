/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Himanshu Kumar
 */   //
public class Test {
    
    public static void main(String[] args){
     ApplicationContext context =  new ClassPathXmlApplicationContext("configconstructor.xml");
  
     Person person = (Person) context.getBean("person");
   
     System.out.println(person);
    }
}
