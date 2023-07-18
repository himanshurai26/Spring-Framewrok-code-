
package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class Test {
    public static void main(String[] args){
        System.out.println("My program Started.......");
     
        //sppring jdbc=> JdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("configjdbc.xml");
   
        // This is not reccomended process of  doing spring jdbc connection 
      
  StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    
  // Student student = new Student();
  //student.setStudentId(678);
  //student.setStudentName("Lalu Yadav");
 // student.setStudentAddress("Patna");
   
 //  int result = studentDao.insert(student);
 // System.out.println("Student Added: " +result);
  
// Student student = new Student();
// student.setStudentId(666);
// student.setStudentName("Raja Kumar");
// student.setStudentAddress("Kolkata");
 
// int result = studentDao.update(student);
  //  System.out.println(result);
  
  
  //delete
  //int result = studentDao.delete(666);
  // System.out.println("Deleted:" + result);
   
  //Student student = studentDao.getStudent(432);
    
  //System.out.println(student);
  
  List<Student> students = studentDao.getAllStudents();
   for(Student s:students){
       System.out.println(s);
   }
    }
    
    
}
