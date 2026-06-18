package Annotations.Example4;

import org.springframework.stereotype.Component;


@Component
public class Address {

    private int pinCode;
    private String city;


    public Address(){

        System.out.println(" Address Object is created ");
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
