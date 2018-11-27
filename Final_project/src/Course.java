import java.io.Serializable;
import java.util.ArrayList;

public class Course implements ManageFiles, Serializable{
    private String courseName;
    private int credits;
    private ArrayList<CourseFile> files;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public Course(String courseName,int credits,ArrayList<Teacher> teachers){
        this.courseName = courseName;
        this.credits = credits;
        this.teachers = teachers;
    }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public ArrayList<Teacher> getTeachers() { return teachers; }
    public void addTeacher(Teacher t) { teachers.add(t); }
    public void deleteTeacher(Teacher t) { teachers.remove(t); }

    public ArrayList<Student> getStudents() { return students; }
    public void addStudent(Student s) { students.add(s); }
    private void deleteStudent(Student s) { students.remove(s); }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    @Override
    public ArrayList<CourseFile> getFiles() {
        return files;
    }

    @Override
    public CourseFile getFile(String title) {
        CourseFile file = null;
        for(CourseFile f:files){
            if(f.getTitle().equals(title)){
                file = f;
                break;
            }
        }
        return file;
    }

    @Override
    public void addFile(CourseFile courseFile) {
        files.add(courseFile);
    }

    @Override
    public void deleteFile(String title) {
        for(CourseFile f:files){
            if(f.getTitle().equals(title)){
                files.remove(f);
                break;

            }
        }

    }
}