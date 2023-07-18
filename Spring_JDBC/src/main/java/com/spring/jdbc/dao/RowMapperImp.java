
package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Himanshu Kumar
 */
public class RowMapperImp implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
       
        Student student = new Student();
        student.setStudentId(rs.getInt(1));
        student.setStudentName(rs.getString(2));
        student.setStudentAddress(rs.getString(3));
        
        return student;
    }
    
}
