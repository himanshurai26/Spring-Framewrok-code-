/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Himanshu Kumar
 */
public class rowMappercustDaoImp implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        Customer customer = new Customer();
        
        customer.setCustomerId(rs.getInt(1));
        customer.setCustomerName(rs.getString(2));
        customer.setCustomerCity(rs.getString(3));
        customer.setCustomerPhoneNumber(rs.getInt(4));
        
        return customer;
    }
    
}
