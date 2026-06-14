package springUsingXML.Example2;

public class Course {

    private String courseName;

    public Course() {
        System.out.println("Course Object Created");
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
