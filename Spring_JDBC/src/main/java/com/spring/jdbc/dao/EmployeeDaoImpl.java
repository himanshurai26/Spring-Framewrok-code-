
package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Employee;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeDaoImpl implements EmployeeDao {
    private JdbcTemplate jdbcTemplate;

   // public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
   //     this.jdbcTemplate = jdbcTemplate;
   // }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    

    @Override
    public int Insert(Employee emp) {
      
      String qr = "insert into student1(id, Name, Salary) values(?, ?, ?)";
      
    int result = this.jdbcTemplate.update(qr, emp.getId(),emp.getName(),emp.getSalary());
    return result;
    }

    @Override
    public int update(Employee emp) {
        String qr= "update student1 set Name=?, Salary = ? where id=?";
        
       int result = this.jdbcTemplate.update(qr,emp.getName(),emp.getSalary(), emp.getId());
   
       return result;
    }

    @Override
    public int delete(int id) {
       String qr ="delete from student1 where id=?";
       
       int result = this.jdbcTemplate.update(qr,id);
       
       return result;
    }

    @Override
    public Employee getEmployee(int id) {
       String query = "select * from student1 where id=?";
       
       RowMapper<Employee> rowMapper = new rownMapperEmpImp();
       
     Employee result = this.jdbcTemplate.queryForObject(query, rowMapper, id);
      
      return result;
    }

    @Override
    public List<Employee> getEmployee() {
        String query = "select * from student1";
        
     List<Employee> result = this.jdbcTemplate.query(query, new rownMapperEmpImp());
     return result;
    }
    


    
    
}
