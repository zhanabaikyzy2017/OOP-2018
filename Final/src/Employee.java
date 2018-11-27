import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public abstract class Employee extends Person implements Comparable<Employee>{
    protected double salary;

    public Employee(String login,String password,String name,double salary){
        super(login,password,name);
        this.salary = salary;
    }
    public Employee(){}

    public double getSalary(){return salary;}
    public void setSalary(double salary){this.salary = salary;}

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(!super.equals(o)) return false;

        Employee e = (Employee) o;
        return Double.compare(e.salary,salary) == 0;
    }

    @Override
    public int compareTo(Employee o) {
        if(o.salary < this.salary){
            return 1;
        }
        if(o.salary > this.salary){
            return  -1;
        }
        return 0;
    }
    public void update(){
        super.update();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter new salary");
        setSalary(scan.nextDouble());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary = "+salary+"}"
                +super.toString();
    }
    public Person create(Person s){
        Employee res = (Employee) super.create(s);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter salary");

        res.setSalary(scan.nextDouble());
        return res;
    }


}
