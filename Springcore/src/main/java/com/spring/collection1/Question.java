
package com.spring.collection1;

import java.util.Iterator;
import java.util.List;


public class Question {
    private int id;
    private String name;
    private List<Answer> answers;
    
    public Question()
    {
     
    }
    
    public Question(int id, String name, List<Answer> answers){
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
                
    }
    
    public void displayInfo(){
        System.out.println("Question Number is :" + id);
        System.out.println("Answer are: ");
        
        Iterator<Answer> itr = answers.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", name=" + name + ", answers=" + answers + '}';
    }
    
    
}
