package org.Example6;

public class Employee {

    private String name;
    private int id;

    private double salary;

    private Address address;

    public Employee() {

        System.out.println(" Employee object is created ");
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println(" Employee Address is called : " + address.getCity());
        this.address = address;
    }
}
