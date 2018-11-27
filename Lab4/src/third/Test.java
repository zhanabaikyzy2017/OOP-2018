package third;

import java.util.Date;

public class Test {
    public static void main(String args[]){
        Employee [] team = {new Employee()};
        Manager m1 = new Manager("Assem",200,new Date(2000,3,24),"09dsfj",team);
        try{
            Manager m2 = (Manager)m1.clone();

        }catch (CloneNotSupportedException ex){
            System.out.println("error");
        }
        //System.out.println(m2)
        //System.out.println(m1.equals(m2));
    }
}
