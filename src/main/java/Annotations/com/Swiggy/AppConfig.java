package Annotations.com.Swiggy;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ={ "Annotations.com.Swiggy","Annotations.com.Amazon"})
public class AppConfig {


}
