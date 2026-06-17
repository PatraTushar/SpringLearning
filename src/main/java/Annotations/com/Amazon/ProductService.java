package Annotations.com.Amazon;


import org.springframework.stereotype.Component;

@Component
public class ProductService {

    public ProductService(){

        System.out.println(" ProductService Object is created ");
    }

    public void pay() {
        System.out.println("Payment Successful");
    }
}
