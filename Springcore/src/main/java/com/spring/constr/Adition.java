/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.constr;


public class Adition {
    private int a;
    private int b;
    
     public Adition(double a, double b){
        this.a = (int) a;
        this.b = (int) b;
        
        System.out.println("Constructor : double , double");
        
    }
    
    public Adition(int a, int b){
        this.a = a;
        this.b = b;
        
        System.out.println("Constructor int , int");
    }
    
    public Adition(String a, String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        
        System.out.println("Constrcutor String, String");
    }
    
   
    
    public void doSum(){
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println("Sum is = " + (this.a + this.b));
    }
    
     
    
}
