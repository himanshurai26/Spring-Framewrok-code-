
package com.spring.constr;


public class Person1 {
    private int roll_no;
    private String PersonName;
    private String  personAddress;
    private certi certi;

    public Person1(int roll_no, String PersonName, String personAddress, certi certi) {
        this.roll_no = roll_no;
        this.PersonName = PersonName;
        this.personAddress = personAddress;
        this.certi = certi;
    }

    @Override
    public String toString() {
       // return "Person1{" + "roll_no=" + roll_no + ", PersonName=" + PersonName + ", personAddress=" + personAddress + '}';
     return this.roll_no + " : " + this.PersonName + " : " + this.personAddress + "{"+ this.certi.name+"}";   
    }

    
    

    
    
    
    
}
