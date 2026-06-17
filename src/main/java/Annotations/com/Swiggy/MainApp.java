package Annotations.com.Swiggy;

import Annotations.com.Swiggy.Payment.PaymentService;
import Annotations.com.Swiggy.Users.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentService ps =
                container.getBean("paymentService", PaymentService.class);

        UserService us =
                container.getBean("userService", UserService.class);

        ps.pay();
        us.login();


    }
}
