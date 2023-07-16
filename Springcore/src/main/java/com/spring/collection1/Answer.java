/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.collection1;

/**
 *
 * @author Himanshu Kumar
 */
class Answer {
    private int id;
    private String name;
    private String by;

    public Answer() {
    }

    public Answer(int id, String name, String by) {
        this.id = id;
        this.name = name;
        this.by = by;
    }

    @Override
    public String toString() {
        return "Answer{" + "id=" + id + ", name=" + name + ", by=" + by + '}';
    }
    
    
    
}
