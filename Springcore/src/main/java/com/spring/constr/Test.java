
package com.spring.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args){
        
      ApplicationContext con =  new ClassPathXmlApplicationContext("configconstr.xml");
      
      Person1 per =  (Person1) con.getBean("pr");
    //  certi cr = (certi) con.getBean("cr");
      
     Adition add = (Adition) con.getBean("ad");
       
      System.out.println(per);
      
     // System.out.println(add);
     add.doSum();
     // System.out.println(cr);
    }
}
