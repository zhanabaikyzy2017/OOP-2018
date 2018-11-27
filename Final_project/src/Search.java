import java.util.ArrayList;

public interface Search {
    Student findStudent(String login);

    Teacher findTeacher(String login);

    Course findCourse(String courseName, ArrayList<String> teachers);
}
