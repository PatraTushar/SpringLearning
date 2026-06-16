package Annotations.Example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1=(Student) container.getBean("student1");
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getMarks());

        College clg1=(College) container.getBean("college1");
        System.out.println(clg1.getCollegeName());
        System.out.println(clg1.getCount());



        College clg2=(College) container.getBean("college2");
        System.out.println(clg2.getCollegeName());
        System.out.println(clg2.getCount());


        College clg3=(College) container.getBean("getCollege3");
        System.out.println(clg3.getCollegeName());
        System.out.println(clg3.getCount());


        Student s2=(Student) container.getBean("stud");
        System.out.println(s2.getName());
        System.out.println(s2.getId());
        System.out.println(s2.getMarks());
    }



}
