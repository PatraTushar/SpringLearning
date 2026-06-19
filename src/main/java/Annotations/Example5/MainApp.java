package Annotations.Example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);

       PaymentGateway p1=(PaymentGateway) container.getBean("paymentGateway");

       PaymentType p=p1.getPaymentType();

        System.out.println(p.getPaymentType());
    }
}
