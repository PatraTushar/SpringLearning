package Annotations.Example4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("Annotations.Example4")
@Configuration
public class SpringBeanConfiguration {


    @Bean
    public Address addressOne() {

        Address a = new Address();
        a.setPinCode(500072);
        a.setCity("Hyderabad");
        return a;
    }


}
