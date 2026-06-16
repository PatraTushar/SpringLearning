package Annotations.Example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class springConfigI {


    @Bean("student1")
    public Student getStudent1() {

        return new Student();
    }


    @Bean("student2")
    public Student getStudent2() {


        return new Student();

    }


    @Bean("college1")
    public College getCollege1() {

        System.out.println(" This is getCollege1 method ");

        return new College();

    }

    @Bean("college2")
    public College getCollege2() {

        System.out.println(" This is getCollege2 method ");
        College clg = new College();
        clg.setCollegeName(" XYZ College ");
        clg.setCount(5000);

        return clg;

    }

}
