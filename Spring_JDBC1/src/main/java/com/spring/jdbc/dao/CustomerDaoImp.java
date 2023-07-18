/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author Himanshu Kumar
 */

@Component("customerDao")
public class CustomerDaoImp implements customerDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Customer customer) {
      String  query = "insert into student2(customerId, customerName, customerCity, customerPhoneNumber) values(?, ?, ?, ?)";
     // String query = "insert into student(studentId,studentName,studentAddress) values(?,?,?)";
      
     int result = this.jdbcTemplate.update(query, customer.getCustomerId(), customer.getCustomerName(), customer.getCustomerCity(), customer.getCustomerPhoneNumber());
     
     return result;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int update(Customer customer) {
       String query = "update student2 set customerName =? where customerId=? ";
       
    int result  =  this.jdbcTemplate.update(query, customer.getCustomerName(), customer.getCustomerId());
  
    return result;
    
    }

    @Override
    public int delete(int customerId) {
        String query = "delete from student2 where customerId=?";
        
     int result = this.jdbcTemplate.update(query, customerId);
     
     return result;
        
    }

    @Override
    public Customer getCustomer(int customerId) {
        String query = "select * from student2 where customerId=?";
        
        RowMapper<Customer> rowMapper = new rowMappercustDaoImp();
        Customer customer = this.jdbcTemplate.queryForObject(query, rowMapper,customerId);
     
     return customer;
        
    }

    @Override
    public List<Customer> getAllCustomer() {
        String query = "select * from student2";
        
      List<Customer> result = this.jdbcTemplate.query(query, new rowMappercustDaoImp());
        
        return result;
    }

    
    
    
    
}
