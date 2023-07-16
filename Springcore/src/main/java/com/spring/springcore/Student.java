
package com.spring.springcore;

/**
 *
 * @author Himanshu Kumar
 */
public class Student {
    private int StudentId;
    private String StudentName;
    private String StudentAddress;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String StudentAddress) {
        this.StudentAddress = StudentAddress;
    }

    public Student(int StudentId, String StudentName, String StudentAddress) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.StudentAddress = StudentAddress;
    }

    public Student() {
        super();
    }


    @Override
    public String toString() {
        return "Student{" + "StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress + '}';
    }
    
    
}
