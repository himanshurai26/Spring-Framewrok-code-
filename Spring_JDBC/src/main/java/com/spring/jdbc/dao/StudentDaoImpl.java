/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Himanshu Kumar
 */
public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {

        //insert query
        String query = "insert into student(studentId,studentName,studentAddress) values(?,?,?)";
   int r = this.jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getStudentAddress());
        return r;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int update(Student student) {
       //updating data
       String query = "update student set studentName=?, studentAddress=? where studentId=? ";
   int r = this.jdbcTemplate.update(query,student.getStudentName(),student.getStudentAddress(),student.getStudentId());
   
      return r;
    }

    @Override
    public int delete(int studentId) {
       //delete operation 
       String query = "delete from student where StudentId=?";
      int r =  this.jdbcTemplate.update(query,studentId);
        
        return r;
        
    }

    @Override
    public Student getStudent(int studentId) {
        //selecting single student data
        String query = "select * from student where studentId=?";
      
       RowMapper<Student> rowMapper = new RowMapperImp();
      Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        //selecting all students 
        
       String query = "select * from student";
     List<Student> students =   this.jdbcTemplate.query(query, new RowMapperImp());
   
     return students;
    }

}
