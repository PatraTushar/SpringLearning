package org.Example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("bean5.xml");

        System.out.println(" -------- Order1 Information ---------- ");

        OrderInformation o1 = (OrderInformation) container.getBean("order1");
        o1.totalProduct();
        o1.yearOfRelease();
        List<String> productNames = o1.getProductNames();
        System.out.println(" Total Product is : " + productNames.size());


        System.out.println(" -------- Order2 Information ----------- ");

        OrderInformation o2 = (OrderInformation) container.getBean("order2");
        o2.totalEmail();
        o2.allProductAndPrices();


    }
}
