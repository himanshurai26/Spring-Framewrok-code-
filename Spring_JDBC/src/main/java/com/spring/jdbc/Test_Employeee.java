package com.spring.jdbc;

import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.entities.Employee;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Employeee {

    public static void main(String[] args) {
        System.out.println("My program is Runing...");
        ApplicationContext con = new ClassPathXmlApplicationContext("employeeconfig.xml");

        EmployeeDao dao = con.getBean("employeeDao", EmployeeDao.class);

       /* Employee employee = new Employee();
        employee.setId(237);
        employee.setName(" Piyush Rai");
        employee.setSalary(20000);

        int inserted = dao.Insert(employee);

        System.out.println("Employee Inserted : " + inserted);  
               /* Employee employee = new Employee();
   employee.setId(234);
   employee.setName("Himanshu Kumar Rai ");
   employee.setSalary(35000);
   
   int updated = dao.update(employee);
   
   System.out.println("Record Updated :" + updated); */
    
  
  //int result = dao.delete(236);
  
  //System.out.println(result);
  
  //  Employee employee = dao.getEmployee(237);
    
  //  System.out.println(employee);
    
    List<Employee> employee =  dao.getEmployee();
    
    for(Employee e: employee){
        System.out.println(e);
    }
        
    }
}
