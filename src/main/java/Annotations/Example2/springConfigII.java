package Annotations.Example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class springConfigII {

    @Bean("college3")
    public College getCollege3() {

        System.out.println(" This is getCollege3 method ");
        College clg = new College();
        clg.setCollegeName(" ABC College ");
        clg.setCount(1000);

        return clg;

    }
}
