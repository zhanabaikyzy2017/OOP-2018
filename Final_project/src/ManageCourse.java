import java.util.ArrayList;

public interface ManageCourse {
    ArrayList<String> getCourses();

    ArrayList<Course> getCoursesObj();

    Course getCourse(String courseName);

    void addCourses(Course course);

    void deleteCourse(Course course);
}
