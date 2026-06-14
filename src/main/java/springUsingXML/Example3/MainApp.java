package springUsingXML.Example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("bean3.xml");
        Object obj = container.getBean("employee");
        Employee e = (Employee) obj;
        e.info();
    }
}
