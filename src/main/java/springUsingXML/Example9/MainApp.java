package springUsingXML.Example9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("bean9.xml");

       Cart c1=(Cart) container.getBean("cart1");

       c1.getProduct().info();
       c1.getProduct2().info();
        System.out.println(c1.getInformation());

        Order o1=(Order) container.getBean("order");

        System.out.println(o1.getCart1().getInformation());
    }
}
