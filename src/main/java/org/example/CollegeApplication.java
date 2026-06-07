package org.example;

public class CollegeApplication {


    public static void main(String[] args) {


        // creating object of Address Class
        Address address1=new Address();
        address1.setLocation("Hyderabad");
        address1.setPinCode(500072);

        // Student Object
        Student s1=new Student();
        s1.setName("Tushar");
        s1.setMobileNumber(9647234532l);
        s1.setAddress(address1);        // student is having dependency of address object

        System.out.println(s1.getName());
        System.out.println(s1.getMobileNumber());
        Address addr=s1.getAddress();
        System.out.println(addr.getLocation());
        System.out.println(addr.getPinCode());
    }


}
