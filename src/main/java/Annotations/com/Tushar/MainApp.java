package Annotations.com.Tushar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    ApplicationContext container=new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);

}
