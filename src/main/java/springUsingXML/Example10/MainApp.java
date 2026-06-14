package springUsingXML.Example10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("bean10.xml");

       College c1=(College) container.getBean("college");
        System.out.println(c1);
        System.out.println(c1.getStudent());

    }


}
