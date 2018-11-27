import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class Admin implements Serializable {
    private String login;
    private String password;

    private final String PATH = "C:\\Users\\Admin\\IdeaProjects\\Final_project";
    private final String FILE = "admin.txt";

    public String getLogin() { return login; }

    public String getPassword() { return password; }

    public Admin(){
        getData();
    }

    private void getData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\Final_project\\src\\admin.txt"));

            String firstLine = br.readLine();
            String secondLine = br.readLine();

            String r_login, r_password;

            try {
                r_login = firstLine;
                r_password = secondLine;

                login = r_login;
                password = r_password;
            }
            catch (Exception e) {
                System.out.println("Wrong data in " + FILE);
            }

        }
        catch (IOException e) {
            System.out.println("Cannot read from " + FILE);
        }
    }

    public void addUser(String lastName, String name, String newLogin, TypeOfUser mode) {
        switch (mode) {
            case STUDENT:
                addStudent(lastName, name, newLogin);
                break;
            case TEACHER:
                addTeacher(lastName, name, newLogin);
                break;
            case MANAGER:
                addManager(lastName, name, newLogin);
                break;
            case EXECUTOR:
                addExecutor(lastName, name, newLogin);
                break;
        }
    }

    public boolean deleteUser(String login) {
        for (User u: Brain.students) {
            if (u.getLogin().equals(login)) {
                Brain.students.remove(u);

                return true;
            }
        }
        for (User u: Brain.managers) {
            if (u.getLogin().equals(login)) {
                Brain.managers.remove(u);

                return true;
            }
        }
        for (User u: Brain.executors) {
            if (u.getLogin().equals(login)) {
                Brain.executors.remove(u);

                return true;
            }
        }
        for (User u: Brain.teachers) {
            if (u.getLogin().equals(login)) {
                Brain.teachers.remove(u);

                return true;
            }
        }

        return false;
    }

    private void addExecutor(String lastName, String name, String newLogin) {
        Executor executor = new Executor(lastName, name, newLogin);

        if (!Brain.executors.contains(executor)) {
            Brain.executors.add(executor);
        }
        else {
            System.out.println(executor.getClass().toString().split(" ")[1] + " already exists!");
        }
    }

    private void addManager(String lastName, String name, String newLogin) {
        Manager manager = new Manager(lastName, name, newLogin);

        if (!Brain.managers.contains(manager)) {
            Brain.managers.add(manager);
        }
        else {
            System.out.println(manager.getClass().toString().split(" ")[1] + " already exists!");
        }
    }

    private void addTeacher(String lastName, String name, String newLogin) {
        Teacher teacher = new Teacher(lastName, name, newLogin);
        Brain.teachers.add(teacher);
       /* if (!Brain.teachers.contains(teacher)) {
            Brain.teachers.add(teacher);
        }
        else {
            System.out.println(teacher.getClass().toString().split(" ")[1] + " already exists!");
        }
        */
    }

    private void addStudent(String lastName, String name, String newLogin) {
        Student student = new Student(lastName, name, newLogin);

        if (!Brain.students.contains(student)) {
            Brain.students.add(student);
        }
        else {
            System.out.println(student.getClass().toString().split(" ")[1] + " already exists!");
        }
    }
}
