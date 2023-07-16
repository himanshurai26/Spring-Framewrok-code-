/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Himanshu Kumar
 */
public class Test {
    public static void main(String[] args){
        ApplicationContext cntx = new ClassPathXmlApplicationContext("configstudent.xml");
       Student1 stdnt = (Student1) cntx.getBean("student2");
       Student1 stnt1 = (Student1)cntx.getBean("student3");
       
       System.out.println(stdnt);
       System.out.println(stnt1);
    }
    
}
