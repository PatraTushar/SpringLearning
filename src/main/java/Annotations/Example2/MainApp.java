package Annotations.Example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.crypto.spec.PSource;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(springConfigI.class, springConfigII.class);
    }
}
