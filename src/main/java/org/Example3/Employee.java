package org.Example3;

public class Employee {

    String name = "Tushar";
    String email = "tushar@gmail.com";
    int empID;

    String companyName;


    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setCompanyName(String companyName){

        this.companyName=companyName;
    }

    public void info(){

        System.out.println(name);
        System.out.println(email);
        System.out.println(empID);
        System.out.println(companyName);
    }
}
