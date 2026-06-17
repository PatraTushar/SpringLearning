package Annotations.Example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(Student.class);

        Student s1=(Student) container.getBean("student1");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getAverageMarks());
    }
}
