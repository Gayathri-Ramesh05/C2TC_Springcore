package org.tnsif.springdi.Springcore_Collegemanagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	College college = context.getBean("college", College.class);
    	System.out.println(college);
        
    }
}