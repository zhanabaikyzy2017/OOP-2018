import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Brain {
    private TypeOfUser mode;
    private Admin admin;
    private User user;
    private Teacher teacher;
    private Student student;
    private Manager manager;
    private Executor executor;
    private ArrayList<Course> currentCourses;
    public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    public static ArrayList<Manager> managers = new ArrayList<Manager>();
    public static ArrayList<Executor> executors = new ArrayList<Executor>();
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Course> courses = new ArrayList<Course>();
    public static ArrayList<News> news = new ArrayList<News>();

    private static final Scanner sc = new Scanner(System.in);

    private static final String PATH = "C:\\Users\\Admin\\IdeaProjects\\Final_project\\";
    private static final String LOG = "log.txt";

    private static final String DATE_PATTERN = "dd.MM.yy HH:mm";

    private static final String EXCEPT_CLASS = "Class not found!";
    private static final String EXCEPT_FILE = "File not found!";
    private static final String EXCEPT_IO = "Input / Output exception!";

    private static final String TEACHERS = "teachers.out";
    private static final String STUDENTS = "students.out";
    private static final String MANAGERS = "managers.out";
    private static final String EXECUTORS = "executors.out";
    private static final String NEWS = "news.out";

    public Brain(){
        load();
    }
    public void begin() {
        System.out.println("Are you an admin or user?");

        String ans = sc.nextLine().toLowerCase();

        if (!(ans.equals("user") || ans.equals("admin"))) return;

        System.out.println("Enter your login");

        String login = sc.nextLine().toLowerCase();
        System.out.println("Enter your password");
        String password = sc.nextLine();

        switch (ans) {
            case "admin":
                sessionAdmin(login, password);
                break;
            case "user":
                sessionUser(login, password);
                break;
        }

        saveData();
    }
    private void sessionAdmin(String login, String password) {
        admin = new Admin();

        if (admin.getLogin().equals(login) && admin.getPassword().equals(password)) {
            String ans = "";

            Brain.writeLog("Admin logged in!");

            while (!ans.equals("exit")) {
                System.out.println("Choose the option!");
                System.out.println("1. Add new user");
                System.out.println("2. Delete user");
                System.out.println("3. Show log file");

                ans = sc.nextLine();

                switch (ans) {
                    case "1":
                        adminAdd();
                        break;
                    case "2":
                        adminRemove();
                        break;
                    case "3":
                        adminLogs();
                        break;
                    case "exit":
                        return;
                    default:
                        System.out.println("Invalid option!");
                        break;
                }
            }


        }
        else {
            System.out.println("Invalid login or password!");
        }
        saveData();
    }
    private void adminAdd() {
        while (true) {
            System.out.println("Who do you want to add?");
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.println("3. Manager");
            System.out.println("4. Executor");

            String ans = sc.nextLine();
            TypeOfUser mode;

            switch (ans) {
                case "1":
                    mode = TypeOfUser.STUDENT;
                    break;
                case "2":
                    mode = TypeOfUser.TEACHER;
                    break;
                case "3":
                    mode =  TypeOfUser.MANAGER;
                    break;
                case "4":
                    mode = TypeOfUser.EXECUTOR;
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Invalid option!");
                    continue;
            }

            System.out.println("Enter lastname");

            String lname = sc.nextLine();

            System.out.println("Enter firstname");

            String name = sc.nextLine();

            System.out.println("Enter login");

            String login = sc.nextLine();

            admin.addUser(lname, name, login, mode);
            saveData();
        }

    }
    private void adminRemove() {
        System.out.println("Enter the login of user you want to delete...");

        String login = sc.nextLine();

        if (admin.deleteUser(login)) {
            System.out.println("Success!");
        }
        else {
            System.out.println("User not found!");
        }
        saveData();
    }

    private void adminLogs() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH + LOG));

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);

                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(EXCEPT_IO);
        }
    }

    private void sessionUser(String login, String password) {
        ArrayList<User> list = new ArrayList<>();
        boolean found = false;
        list.addAll(teachers);
        list.addAll(students);
        list.addAll(managers);
        list.addAll(executors);

        for (User u: list) {
            if (u.getLogin().equals(login) && u.getPassword().equals(password)) {
                user = u;
                found = true;
                Brain.writeLog("User " + u.getLogin() + " logged in!");
                switch (u.getClass().toString().split(" ")[1]) {
                    case "Student":
                        sessionStudent();
                        break;
                    case "Teacher":
                        sessionTeacher();
                        break;
                    case "Manager":
                        sessionManager();
                        break;
                    case "Executor":
                        sessionExecutor();
                        break;
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid login or password!");
        }
        saveData();
    }
    private void sessionStudent() {
        Student student = (Student) user;
        mode = TypeOfUser.STUDENT;

        System.out.println("You are logged as student!");

        System.out.println("Choose the option");
        System.out.println("1. Courses");
        System.out.println("2. Transcript");
        System.out.println("3. Schedule");
        System.out.println("4. News");
        System.out.println("5. Registration");

        String ans = sc.nextLine();

        switch (ans) {
            case "1":
                student.getCourses();
                break;
            case "2":
                System.out.println("There is no transcript");
                break;
            case "3":
                System.out.println("schedule");
                break;
            case "4":
                showNews();
                break;
            case "5":
                System.out.println("Write your Course");
                Scanner scan = new Scanner(System.in);
                for(Course c:courses){
                    if(c.getCourseName().equals(scan.nextLine())){
                        student.addCourses(c);
                    }
                }
        }
    }
    private void sessionTeacher() {
        teacher = (Teacher) user;
        mode = TypeOfUser.TEACHER;

        currentCourses = teacher.getCoursesObj();

        String ans = "";

        System.out.println("You are logged as teacher!");

        while (!ans.equals("exit")) {
            System.out.println("Choose the option you want");
            System.out.println("1. Send Message");
            System.out.println("2. Show Messages");
            System.out.println("3. News");
            System.out.println("4. Courses");
            System.out.println("5. Schedule");
            System.out.println("6. Send order");

            ans = sc.nextLine();

            switch (ans) {
                case "1":
                    writeMessage();
                    break;
                case "2":
                    showMessages();
                    break;
                case "3":
                    showNews();
                    break;
                case "4":
                    teacherCourses();
                    break;
                case "5":
                    showSchedule();
                    break;
                case "6":
                    sendOrder();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Not valid option!");
                    break;
            }
        }
    }
    private void writeMessage() {
        Employee employee;

        switch (mode) {
            case TEACHER:
                employee = teacher;
                break;
            case MANAGER:
                employee = manager;
                break;
            case EXECUTOR:
                employee = executor;
                break;
            default:
                return;
        }

        System.out.println("Write reciever`s login");
        String login = sc.nextLine();

        System.out.println("Write message`s title");
        String title = sc.nextLine();

        System.out.println("Write message`s text");
        String text = sc.nextLine();

        Message message = new Message(title, text, employee.getLogin(), Calendar.getInstance().getTime());

        if (employee.sendMessage(message, login)) {
            System.out.println("Message sent!");
        }
        else {
            System.out.println("Login not found!");
        }
    }
    private void showMessages() {
        Employee employee = null;

        switch (mode) {
            case TEACHER:
                employee = teacher;
                break;
            case MANAGER:
                employee = manager;
                break;
            case EXECUTOR:
                employee = executor;
                break;
            default:
                return;
        }

        System.out.println(employee.getMessages());

        System.out.println("Which message you want to show?");

        String ans = "";

        while (!ans.equals("exit")) {
            ans = sc.nextLine();

            try {
                int ind = Integer.parseInt(ans);

                ind--;

                if (ind > -1 && ind < employee.getMessages().size()) {
                    employee.readMessage(ind);
                }
                else {
                    System.out.println("Wrong selection");
                }
            }
            catch (Exception e) {
                System.out.println("Wrong selection");
            }
        }

    }

    private void teacherCourses() {
        String ans = "";

        while (!ans.equals("exit")) {
            System.out.println("Your courses:");

            for (int i = 0; i < currentCourses.size(); ++i) {
                System.out.println((i + 1) + ". " + currentCourses.get(i).getCourseName());
            }

            System.out.println("Select course you want");

            ans = sc.nextLine();

            try {
                int ind = Integer.decode(ans);

                ind--;

                if (ind > -1 && ind < currentCourses.size()) {
                    teacherCourse(ind);
                }
                else {
                    System.out.println("Wrong selection");
                }
            }
            catch (Exception e) {
                System.out.println("Wrong selection");
            }
        }

    }
    private void teacherCourse(int ind) {
        String ans = "";

        while (!ans.equals("exit")) {
            System.out.println("Choose the option you want");
            System.out.println("1. Add file");
            System.out.println("2. Delete file");
            System.out.println("3. Show students");
            System.out.println("4. Show Info");

            ans = sc.nextLine();

            switch (ans) {
                case "1":
                    teacherAddFile(ind);
                    break;
                case "2":
                    showSchedule();
                    break;
                case "3":

                    break;
                case "4":
                    System.out.println(currentCourses.get(ind));
                    break;
                default:
                    System.out.println("Not valid option!");
                    break;
            }
        }
    }

    private void teacherAddFile(int ind) {
        System.out.println("Load the file you want to add");

        System.out.println("What`s its title?");
        String title = sc.nextLine();

        System.out.println("What`s its text?");
        String text = sc.nextLine();

        CourseFile courseFile = new CourseFile(title, text, teacher.getLogin());

        currentCourses.get(ind).addFile(courseFile);

    }

    private void showSchedule() {
        System.out.println("NO Schedule");
    }

    private void showNews() {
        int limit = 7;
        String ans = "";

        for (int i = 0; i < news.size(); ++i) {
            System.out.println((i + 1) + ". " + news.get(news.size() - i - 1).getTitle());

            if (i == limit) break;
        }

        System.out.println("Select the news you want");

        while (!ans.equals("exit")) {
            ans = sc.nextLine();

            try {
                int ind = Integer.parseInt(ans);

                ind--;

                if (ind > -1 && ind < limit + 1) {
                    showNews(ind);
                }
                else {
                    System.out.println("Wrong selection");
                }
            }
            catch (Exception e) {
                if (ans.equals("exit")) {
                    break;
                }

                System.out.println("Wrong selection");
            }
        }
    }
    private void showNews(int ind) {
        System.out.println(news.get(news.size() - ind - 1));
    }
    private void sendOrder() {
        System.out.println("Write order you want to send");

        System.out.println("What`s its title?");
        String title = sc.nextLine();

        System.out.println("What`s its text?");
        String text = sc.nextLine();

        Order order = new Order(title, text, teacher.getLogin(), Calendar.getInstance().getTime());

        teacher.sendOrder(order);
    }
    private void sessionManager() {
        manager = (Manager) user;
        mode = TypeOfUser.MANAGER;
    }
    private void sessionExecutor() {
        executor = (Executor) user;
        mode = TypeOfUser.EXECUTOR;

        String ans = "";

        System.out.println("You are logged as executor!");

        while (!ans.equals("exit")) {

            System.out.println("Choose the option you want");
            System.out.println("1. News");
            System.out.println("2. Show new orders");
            System.out.println("3. Show not done orders");
            System.out.println("4. Show done orders");
            System.out.println("5. Show rejected orders");
            System.out.println("6. Show messages");
            System.out.println("7. Write messages");

            ans = sc.nextLine();

            switch (ans) {
                case "1":
                    showNews();
                    break;
                case "2":
                    executorOrders(orderStatus.NEW);
                    break;
                case "3":
                    executorOrders(orderStatus.NOT_DONE);
                    break;
                case "4":
                    executorOrders(orderStatus.ACCEPTED);
                    break;
                case "5":
                    executorOrders(orderStatus.REJECTED);
                    break;
                case "6":
                    showMessages();
                    break;
                case "7":
                    writeMessage();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Not valid option!");
                    break;
            }
        }
    }
    private void executorOrders(orderStatus status) {
        ArrayList<Order> orders = executor.getOrders(status);

        for (int i = 0; i < orders.size(); ++i) {
            System.out.println((i + 1) + ". " + orders.get(i).getTitle());
        }
        String ans = "";

        System.out.println("Select one order!");

        while (!ans.equals("exit")) {
            ans = sc.nextLine();

            try {
                int ind = Integer.decode(ans);

                ind--;

                if (ind > -1 && ind < orders.size()) {
                    executorOrder(orders.get(ind));
                }
                else {
                    System.out.println("Wrong selection");
                }
            }
            catch (Exception e) {
                if (ans.equals("exit")) {
                    break;
                }

                System.out.println("Wrong selection");
            }
        }
    }
    private void executorOrder(Order order) {
        System.out.println(order);

        String ans = "";

        if (order.getStatus() == orderStatus.NEW) {
            System.out.println("Accept this order or reject?");

            ans = sc.nextLine().toLowerCase();

            switch (ans) {
                case "accept":
                    order.setStatus(orderStatus.ACCEPTED);
                    break;
                case "reject":
                    order.setStatus(orderStatus.REJECTED);
                    break;
                default:
                    System.out.println("Not valid operation!");
                    break;
            }
        }

        else if (order.getStatus() == orderStatus.NOT_DONE) {
            System.out.println("Have this order done?");

            ans = sc.nextLine().toLowerCase();

            switch (ans) {
                case "yes":
                    order.setStatus(orderStatus.ACCEPTED);
                case "no":
                    break;
                default:
                    System.out.println("Not valid operation!");
                    break;
            }
        }
        Executor.saveOrders();
    }
    private static void writeLog(String msg) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(PATH + LOG, true));

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_PATTERN);

            bw.write(dtf.format(LocalDateTime.now())+ " - " + msg + "\n");

            bw.flush();
            bw.close();
        }
        catch (IOException e) {
            System.out.println(EXCEPT_IO);
        }
    }
    private void load() {
        loadStudents();
        loadTeachers();
        loadExecutors();
        loadManagers();
    }

    private void loadStudents() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(STUDENTS));

            students = (ArrayList<Student>) ois.readObject();

            ois.close();

        }
        catch (ClassNotFoundException e) {
            System.out.println(STUDENTS + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(STUDENTS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(STUDENTS + ": " + EXCEPT_IO);
        }
    }

    private void loadTeachers() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TEACHERS));

            teachers = (ArrayList<Teacher>) ois.readObject();

            ois.close();

        }
        catch (ClassNotFoundException e) {
            System.out.println(TEACHERS + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(TEACHERS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(TEACHERS + ": " + EXCEPT_IO);
        }
    }

    private void loadManagers() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(MANAGERS));

            managers = (ArrayList<Manager>) ois.readObject();

            ois.close();
        }
        catch (ClassNotFoundException e) {
            System.out.println(MANAGERS + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(MANAGERS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(MANAGERS + ": " + EXCEPT_IO);
        }
    }

    private void loadExecutors() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(EXECUTORS));

            executors =(ArrayList<Executor>) ois.readObject();

            ois.close();

        }
        catch (ClassNotFoundException e) {
            System.out.println(EXECUTORS + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(EXECUTORS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(EXECUTORS + ": " + EXCEPT_IO);
        }
    }

    // SERIALIZAION
    private static void saveData() {
        saveManagers();
        saveTeachers();
        saveStudents();
        saveExecutors();
    }

    private static void saveStudents() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(STUDENTS));

            oot.writeObject(students);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(STUDENTS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(STUDENTS + ": " + EXCEPT_IO);
        }
    }

    private static void saveTeachers() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(TEACHERS));

            oot.writeObject(teachers);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(TEACHERS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(TEACHERS + ": " + EXCEPT_IO);
        }
    }

    private static void saveManagers() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(MANAGERS));

            oot.writeObject(managers);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(MANAGERS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(MANAGERS + ": " + EXCEPT_IO);
        }
    }

    private static void saveExecutors() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(EXECUTORS));

            oot.writeObject(executors);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(EXECUTORS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(EXECUTORS + ": " + EXCEPT_IO);
        }
    }
}
