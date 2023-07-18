/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Customer;
import java.util.List;

/**
 *
 * @author Himanshu Kumar
 */
public interface customerDao {
    
   public int insert( Customer customer);
   public int update(Customer customer);
   public int delete(int customerId);
   public Customer getCustomer(int customerId);
   
   public List<Customer> getAllCustomer();
}
