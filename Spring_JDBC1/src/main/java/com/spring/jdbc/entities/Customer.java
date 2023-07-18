/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.jdbc.entities;

/**
 *
 * @author Himanshu Kumar
 */
public class Customer {
    private int customerId;
    private String customerName;
    private String customerCity;
    private int customerPhoneNumber;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customerCity, int customerPhoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerCity = customerCity;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerName=" + customerName + ", customerCity=" + customerCity + ", customerPhoneNumber=" + customerPhoneNumber + '}';
    }
    
    
    
}
