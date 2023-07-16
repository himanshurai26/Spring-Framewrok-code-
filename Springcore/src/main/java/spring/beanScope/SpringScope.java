
package spring.beanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringScope {
    //@Value("Hello I am Learning the concept of Bean Scope")
    private String message;

 
    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

   
    
    
}
