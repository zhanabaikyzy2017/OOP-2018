import org.jetbrains.jetCheck.PropertyFailure;

import java.io.Serializable;
import java.util.ArrayList;

public class Student extends User implements ManageCourse, Serializable{
    private String id;
    private Degree degree;
    private Faculty faculty;
    private int yearOfStudy;
    private double gpa;
    private ArrayList<Course> courses;

    public Student (String lastName, String firstName, String login) {
        super(lastName, firstName, login);
        yearOfStudy = 1;
        id = "00";
        courses = new ArrayList<Course>();
    }

    public String getId() { return id; }

    public int getYearOfStudy() { return yearOfStudy; }

    public void incrYearOfStudy() { yearOfStudy++; }

    @Override
    public ArrayList<String> getCourses() {
        return null;
    }

    @Override
    public ArrayList<Course> getCoursesObj() {
        ArrayList<Course> curCourses = new ArrayList<>();

        for (Course c: Brain.courses) {
            for (Course s: courses) {
                if (c.equals(s) && c.getStudents().contains(this)){
                    curCourses.add(c);
                }
            }

        }

        return curCourses;
    }

    @Override
    public Course getCourse(String courseName) {
        return null;
    }

    @Override
    public void addCourses(Course course) {
        courses.add(course);
    }

    @Override
    public void deleteCourse(Course course) {

    }

}