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
    public College getCollege(){

        return new College();
    }


    @Bean("college2")
    public College getCollege2(){

        College clg=new College();

        clg.setCollegeName(" ABC college ");
        clg.setCount(500);

        return clg;

    }








}
