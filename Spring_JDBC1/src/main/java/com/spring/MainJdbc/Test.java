
package com.spring.MainJdbc;

import com.spring.jdbc.dao.customerDao;
import com.spring.jdbc.entities.Customer;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Himanshu Kumar
 */
public class Test {
    public static void main(String[] args){
        System.out.println("Learning the concept of spring jdbc");
        
      System.out.println("**********************************");
      
    // ApplicationContext context = new ClassPathXmlApplicationContext("configjdbc2.xml");
    
    ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    customerDao dao = context.getBean("customerDao",customerDao.class);
     
     
   //  Customer customer = new Customer();
     
     // customer.setCustomerId(26);
    //  customer.setCustomerName("Mera Beta Shashank");
   ///   customer.setCustomerCity("Haryana");
    //  customer.setCustomerPhoneNumber(948367775);
     
    // int InsertRecord = dao.insert(customer);
     
   //  System.out.println("Data insertion");
    // System.out.println("Customer Inserted= " + InsertRecord);
    
   //// customer.setCustomerId(26);
  //  customer.setCustomerName("Priyanshu Kumar");
    
  //  int updated = dao.update(customer);
    
  //  System.out.println(updated);
  
  // int deleted = dao.delete(26);
   
  // System.out.println("deleted data =" + deleted);
  
    //Customer result = dao.getCustomer(24);
      
  //  System.out.println(result);
  
  List<Customer> customer = dao.getAllCustomer();
   
  for(Customer c : customer){
      System.out.println(c);
  }
    }
    
}
