import com.intellij.testFramework.TeamCityLogger;

import java.io.Serializable;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;

public class Manager extends Employee implements Serializable,ManageNews,Search{
    private Faculty faculty;
    public Manager(String lastname,String firstname,String login){
        super(lastname,firstname,login);
    }
    public Faculty getFaculty(){
        return this.faculty;
    }
    public void setFaculty(Faculty faculty){
        this.faculty = faculty;
    }

    @Override
    public void addNews(News news) {
        Brain.news.add(news);

    }

    @Override
    public void deleteNews(News news) {
        Brain.news.remove(news);
    }

    @Override
    public Course findCourse(String courseName, ArrayList<String> teachers) {
        return null;
    }

    @Override
    public Student findStudent(String login) {
        Student student = null;
        for(Student s : Brain.students){
            if(s.getLogin().equals(login)){
                student = s;
                break;
            }
        }
        return student;
    }

    @Override
    public Teacher findTeacher(String login) {
        Teacher teacher = null;

        for(Teacher t:Brain.teachers){
            if(t.getLogin().equals(login)){
                teacher = t;
                break;
            }
        }
        return teacher;
    }
}