package org.Example6;

public class Address {

    private int pinCode;
    private String city;

    private String country;


    public Address() {

        System.out.println(" Address object  is created ");
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


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public void addressInfo() {

        System.out.println(" pinCode is : " + pinCode);
        System.out.println(" city is : " + city);
        System.out.println(" country is : " + country);
    }
}
