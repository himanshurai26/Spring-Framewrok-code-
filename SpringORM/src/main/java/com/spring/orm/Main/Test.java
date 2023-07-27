/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.orm.Main;

import com.spring.entities.Student;
import com.spring.orm.Dao.StudentDao;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Himanshu Kumar
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configORM.xml");

        StudentDao dao = context.getBean("studentDao", StudentDao.class);
//   
//   Student student = new Student(231, "Himanshu", "New Delhi");
//   
//   int Inserted = dao.insert(student);
//    System.out.println("Inserted " + Inserted);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean go = true;
        while (go) {
            System.out.println("****************WELCOME TO SPRING ORM PROJECT****************");
            System.out.println("PRESS 1 for add new student");
            System.out.println("PRESS 2 for display all students");
            System.out.println("PRESS 3  for get detail of single student");
            System.out.println("PRESS 4 for delete students ");
            System.out.println("PRESS 5 for update students");
            System.out.println("PRESS 6 for exit");

            try {

                int input = Integer.parseInt(br.readLine());

//            if(input == 1){
//                // add a new student
//            } else if(input == 2){
//                
//            }
                switch (input) {
                    case 1:
                        // add all new student

                        //taking inputs from user
                        System.out.println("Enter user id : ");
                        int uid = Integer.parseInt(br.readLine());

                        System.out.println("Enter user name : ");
                        String uName = br.readLine();

                        System.out.println("Enter user city : ");
                        String uCity = br.readLine();

                        //creating object and setting values
                        Student s = new Student();
                        s.setStudentId(uid);
                        s.setStudentName(uName);
                        s.setStudentCity(uCity);

                        //saving student object to database by calling insert of student dao
                        int insert = dao.insert(s);
                        System.out.println(insert + " Student added..");
                        System.out.println("*******************************************");
                        System.out.println();
                        break;

                    case 2:
                        // display student

                        List<Student> students = dao.getAllStudents();

                        for (Student st : students) {
                            System.out.println("*****************************************");
                            System.out.println("Id : " + st.getStudentId());
                            System.out.println("Name : " + st.getStudentName());
                            System.out.println("City : " + st.getStudentCity());
                            System.out.println("______________________________________");

                        }
                        break;

                    case 3:

                        //get single student data
                        System.out.println("Enter user id : ");
                        int userid = Integer.parseInt(br.readLine());
                        Student student = dao.getStudent(userid);
                        System.out.println("******************************************************");
                        System.out.println("Id : " + student.getStudentId());
                        System.out.println("Name : " + student.getStudentName());
                        System.out.println("City : " + student.getStudentCity());
                        System.out.println("______________________________________");

                        break;

                    case 4:

                        //delete student
                        System.out.println("Enter user id : ");
                        int id = Integer.parseInt(br.readLine());
                       
                        dao.delete(id);
                        System.out.println("***********************");
                        System.out.println("Student deleted...");
                        
                        break;

                    case 5:
                        //update the student
                     System.out.println("Enter user id to update : ");
                     int updateId = Integer.parseInt(br.readLine());
                     
                     Student studentToUpdate = dao.getStudent(updateId);
                     
                     if(studentToUpdate != null)
                     {
                         System.out.println("Enter new user name : ");
                         String newName = br.readLine();
                         
                         System.out.println("Enter new user city: ");
                         String newCity = br.readLine();
                         
                         //updated the student dara
                         
                         studentToUpdate.setStudentName(newName);
                         studentToUpdate.setStudentCity(newCity);
                         
                         dao.update(studentToUpdate);
                         
                         System.out.println("Student updated successfully");
                         
                     }else{
                         System.out.println("Student with ID " + updateId + " not found.");
                     }
                      
                        break;

                    case 6:
                        //exit

                        go = false;
                        break;


                }

            } catch (Exception e) {
                System.out.println("Invalid Input Try with another one! ");
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Thank you for using my application...");
        System.out.println("see you soon... !!");
    }

}
