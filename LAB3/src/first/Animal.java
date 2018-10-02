package first;

import java.util.Scanner;

public class Animal {
    private String breed;


    public Animal(){
        breed = "";
    }
    public Animal(String breed){
        this.breed= breed;
    }
    public String getBreed() {return breed;};
    public void setBreed(String breed){this.breed = breed;};

    public void Show(){
        System.out.println(getBreed());
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String ss = s.next();
        Animal a = new Animal(ss);
        Dog d = new Dog(ss,"white");
        d.Show();
    }

}
