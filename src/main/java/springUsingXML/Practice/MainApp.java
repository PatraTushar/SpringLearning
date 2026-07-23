package springUsingXML.Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {


        ApplicationContext container = new ClassPathXmlApplicationContext("practice.xml") ;

        OrderInfo o1=(OrderInfo) container.getBean("p1");

        System.out.println(o1.getOrderID());
        System.out.println(o1.getOrderNames());
        System.out.println(o1.getEmailIDS());
        System.out.println(o1.getProductAndPrices());



        OrderInfo o2=(OrderInfo) container.getBean("p2");

        System.out.println(o2.getOrderID());
        System.out.println(o2.getOrderNames());
        System.out.println(o2.getEmailIDS());
        System.out.println(o2.getProductAndPrices());






    }
}
