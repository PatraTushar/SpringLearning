package springUsingXML.Example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {


        // Load XML and start Spring container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        // Get Car object from Spring
        Car car = (Car) context.getBean("car");

        // Use object
        car.drive();
    }
}



// What is happening internally?

//Step-by-step flow:
//Spring reads beans.xml
//Sees <bean id="engine"...> → creates Engine object
//Sees <bean id="car"...> → creates Car object
//
//Injects Engine into Car using:
//
//<property name="engine" ref="engine"/>
//Stores both objects in container (Spring Bean Factory)
//You request car → Spring returns ready-made object

