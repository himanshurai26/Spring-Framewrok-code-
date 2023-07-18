
package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class rownMapperEmpImp implements RowMapper<Employee>{

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        Employee employee = new Employee();
        employee.setId(rs.getInt(1));
        employee.setName(rs.getString(2));
        employee.setSalary(rs.getInt(3));
        
        return employee;
        
    }
    
}
