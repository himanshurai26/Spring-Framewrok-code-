/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Employee;
import java.util.List;

/**
 *
 * @author Himanshu Kumar
 */
public interface EmployeeDao {
     public int Insert(Employee emp);
     public int update(Employee emp);
     public int delete(int id);
     
     public Employee getEmployee(int id);
     
     public List<Employee> getEmployee();
}
