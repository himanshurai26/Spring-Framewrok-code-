package com.spring.autowiring.annotation;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Himanshu Kumar
 */
public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("configautowiring_1.xml");
    
     
      
      
      
 
     
     Emp  emp = context.getBean("emp1", Emp.class);
     
     System.out.println(emp);
            
    
    }
    
}
