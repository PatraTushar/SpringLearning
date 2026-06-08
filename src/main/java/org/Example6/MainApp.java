package org.Example6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("bean6.xml");

       Address address=(Address) container.getBean("office");
       address.addressInfo();
    }
}
