class  Student {
    String name;
    int id;
    int year;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        year = 1;
    }

    public void YearIncrement() {
        this.year++;
    }

    public String GetName() {
        return name;
    }

    public int GetId() {
        return id;
    }

}public class Problem1 {
        public static void main(String[] args) {
            Student s = new Student("Assem", 1);
            //System.out.println("safsd");
            System.out.println(s.GetName());
            System.out.println(s.GetId());
            s.YearIncrement();
            System.out.println(s.year);
        }
    }

