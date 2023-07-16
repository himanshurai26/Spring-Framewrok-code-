
package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
    
   public static void main(String[] args){
      
       System.out.println("Test classs");
       
       
        ApplicationContext  cntxt= new ClassPathXmlApplicationContext("refconfig.xml");
        
        A temp = (A) cntxt.getBean("aref");
       System.out.println(temp.getX());
       System.out.println(temp.getOb().getY());
       
       System.out.println(temp);
       
       B temp1 = (B) cntxt.getBean("bref");
       System.out.println(temp1);
       
       
       
       
   }
}
