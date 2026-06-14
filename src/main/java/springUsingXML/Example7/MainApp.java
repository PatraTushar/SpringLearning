package springUsingXML.Example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("bean7.xml");

        patient p1 = (patient) container.getBean("patient1");
        System.out.println(p1);

        patient p2 = (patient) container.getBean("patient2");
        System.out.println(p2);

        patient p3 = (patient) container.getBean("patient3");
        System.out.println(p3);

        patient p4 = (patient) container.getBean("patient4");
        System.out.println(p4);



    }
}
