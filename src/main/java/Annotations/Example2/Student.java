package Annotations.Example2;

public class Student {


    private String name;

    private int id;

    private double marks;

    public Student() {

        System.out.println(" Student Object is created");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
