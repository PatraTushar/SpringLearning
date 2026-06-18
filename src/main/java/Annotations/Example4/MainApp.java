package Annotations.Example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);

        Student s1=(Student) container.getBean("student");




        Address a1=s1.getAddress();

        System.out.println(a1.getPinCode());
        System.out.println(a1.getCity());







    }
}
