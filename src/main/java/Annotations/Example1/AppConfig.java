package Annotations.Example1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("student1")
    public Student getStudent1() {
        return new Student();
    }

    @Bean("student2")
    public Student getStudent2() {
        return new Student();
    }

    @Bean("college1")
    public College getCollege() {

        System.out.println(" This is getCollege method ");
        return new College();
    }


    @Bean("college2")
    public College getCollege2() {

        System.out.println(" This is getCollege2 method ");
        College clg = new College();
        clg.setCollegeName(" ABC college ");
        clg.setCount(500);

        return clg;

    }


    @Bean
    public College getCollege3() {

        System.out.println(" This is getCollege3 method ");
        College clg = new College();
        clg.setCollegeName(" XYZ college ");
        clg.setCount(200);

        return clg;

    }


    @Bean("stud")
    public Student getStudent3(){

        Student s1=new Student();
        s1.setName("Rahul");
        s1.setId(100);
        s1.setMarks(89.2);

        return s1;

    }

    @Bean("stud")
    public Student getStudent4(){

        Student s1=new Student();
        s1.setName("Mohan");
        s1.setId(300);
        s1.setMarks(67.4);

        return s1;

    }



}
