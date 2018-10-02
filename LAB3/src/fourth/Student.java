package fourth;

class Student extends Person{
    int id;
    Student(String s,int id){
        super(s);
        this.id = id;
    }

    @Override
    public String getName() {
        System.out.println("Student name:" + super.getName());
        return super.getName();
    }
}
