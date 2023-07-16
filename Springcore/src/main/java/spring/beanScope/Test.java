/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Himanshu Kumar
 */
public class Test {
    public static void main(String[] args){
        ApplicationContext con = new ClassPathXmlApplicationContext("configspringscope.xml");
 
       SpringScope scope =  con.getBean("springScope",SpringScope.class);
       
      
    // System.out.println(scope.getMessage());
      // System.out.println(scope.hashCode());
  
      scope.setMessage("I am Object A");
      scope.getMessage();
      System.out.println(scope.hashCode());
      
      SpringScope scope1 = con.getBean("springScope",SpringScope.class);
      
      scope1.getMessage();
      System.out.println(scope1.hashCode());
    }    
}
