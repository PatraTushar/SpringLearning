package org.Example2;

public class Student {

    private String name;
    private Course course;

    public Student(){
        System.out.println(" Student Object Created ");
    }

    public void setName(String name){
        this.name=name;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void showDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Course Name  : " + course.getCourseName());
    }
}
