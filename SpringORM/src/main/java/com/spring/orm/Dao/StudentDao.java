/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.orm.Dao;

import com.spring.entities.Student;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 *
 * @author Himanshu Kumar
 */
public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    //save student 
    @Transactional
    public int insert(Student student) {

        //
        int i = (int) this.hibernateTemplate.save(student);
        return i;
    }

    //get the single data(object)
    public Student getStudent(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        return student;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

     //get all Students(all rows)
    public List<Student> getAllStudents() {
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
    }
    
    //deleting the data
    @Transactional
    public void delete(int studentId){
     Student student =this.hibernateTemplate.get(Student.class, studentId);
     this.hibernateTemplate.delete(student);
     
    }
    
   //updating data
    @Transactional
    public void update(Student student){
        this.hibernateTemplate.update(student);
    }
    
    

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

}
