package springUsingXML.Example8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("bean8.xml");

        cartItems c1=(cartItems) container.getBean("cart2");
        System.out.println(c1.getItemNames());
        System.out.println(c1.getItems());


        Order o1=(Order) container.getBean("order1");
        o1.cartInfo();


    }
}
