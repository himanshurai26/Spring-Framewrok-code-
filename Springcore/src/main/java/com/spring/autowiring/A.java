
package com.spring.autowiring;

/**
 *
 * @author Himanshu Kumar
 */
public class A {
    B b;

    public A() {
        System.out.println("A is created...");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
    
    void print(){
        System.out.println("HelloI am A");
    }
    
    public void display(){
        print();
        
        b.print();
    }
    
    
    
}
