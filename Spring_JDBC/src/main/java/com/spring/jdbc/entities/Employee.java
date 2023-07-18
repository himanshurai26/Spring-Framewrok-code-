
package com.spring.jdbc.entities;

/**
 *
 * @author Himanshu Kumar
 */
public class Employee {
    private int id;
    private String Name;
    private int Salary;

    public Employee() {
    }

    public Employee(int id, String Name, int Salary) {
        this.id = id;
        this.Name = Name;
        this.Salary = Salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", Name=" + Name + ", Salary=" + Salary + '}';
    }
    
    
    
    
}
