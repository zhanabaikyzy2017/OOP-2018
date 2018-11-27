package fourth;

public class Test {
    public static void printInfo(Person p){
        p.getName();

    }
    public static void main(String args []){
        Student studobj = new Student("Assem",12);
        Employee empobj = new Employee("Dana","FIT");

        Person ref = studobj;
        String s = ref.getName();
        System.out.println(s);

        ref = empobj;

        String s2 = ref.getName();
        System.out.println(s2);


        printInfo(studobj);
        printInfo(empobj);

    }

}
