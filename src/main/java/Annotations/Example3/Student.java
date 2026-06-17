package Annotations.Example3;


import org.springframework.stereotype.Component;

@Component("student1")
public class Student {

    private int id;
    private String name;
    private double averageMarks;

    public Student(){

        System.out.println(" Student Object is created ");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public void setAverageMarks(double averageMarks) {
        this.averageMarks = averageMarks;
    }
}
