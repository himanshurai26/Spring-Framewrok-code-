
package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Himanshu Kumar
 */
public class test {
    public static void main(String[] args){
      
            
        
      ApplicationContext context = new ClassPathXmlApplicationContext("configcollection.xml");
   Employee emp = (Employee) context.getBean("emp");
      
   System.out.println(emp.getName());
   System.out.println(emp.getPhones());
   System.out.println(emp.getAddresses());
   System.out.println(emp.getCourses());
   
   System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
   Question question = (Question) context.getBean("qst");

       question.displayInfo();
    }
}
