/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import java.util.List;

/**
 *
 * @author Himanshu Kumar
 */
public interface StudentDao {
    public int insert(Student student);
    public int update(Student student);
    public int delete(int studentId);
    
    //we are going to get single object 
    public Student getStudent(int studentId);
    
    public List<Student> getAllStudents();
   
}
