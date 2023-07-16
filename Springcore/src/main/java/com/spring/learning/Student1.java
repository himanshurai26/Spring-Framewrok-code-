/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.learning;

/**
 *
 * @author Himanshu Kumar
 */
public class Student1 {
    private int Studentid;
    private String StudentName;
    private int StudentAge;
    private String StudentCity;

    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int Studentid) {
        this.Studentid = Studentid;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int StudentAge) {
        this.StudentAge = StudentAge;
    }

    public String getStudentCity() {
        return StudentCity;
    }

    public void setStudentCity(String StudentCity) {
        this.StudentCity = StudentCity;
    }

    public Student1(int Studentid, String StudentName, int StudentAge, String StudentCity) {
        this.Studentid = Studentid;
        this.StudentName = StudentName;
        this.StudentAge = StudentAge;
        this.StudentCity = StudentCity;
    }
    
    public Student1(){
        super();
    }

    @Override
    public String toString() {
        return "Student1{" + "Studentid=" + Studentid + ", StudentName=" + StudentName + ", StudentAge=" + StudentAge + ", StudentCity=" + StudentCity + '}';
    }
    
    
    
}
