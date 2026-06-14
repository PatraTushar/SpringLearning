package springUsingXML.Example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("bean4.xml");

        ProductInformation p1=(ProductInformation) container.getBean("product1");
        System.out.println(p1);

        ProductInformation p2=(ProductInformation) container.getBean("product2");
        System.out.println(p2);






    }
}
