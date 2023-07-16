/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.collection;
//Injecting collection value by constrcutor in spring
/// there can be used three elements inside the constructor-args element

import java.util.Iterator;
import java.util.List;

//1 list,2 set,3 map

public class Question {
    private int id;
    private String name;
    private List<String> answers;
    
    public Question(){
        System.out.println("Inside Constructor..");
    }
    
    public Question(int id, String name, List<String> answers){
       super();
        this.id = id;
       this.name = name;
        this.answers = answers;
       
    }
    
    public void displayInfo(){
        System.out.println("Question Number is: " + id );
        System.out.println("Question is: " + name);
        System.out.println("Answer are: ");
        Iterator<String> itr = answers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            
        }
    }
}
