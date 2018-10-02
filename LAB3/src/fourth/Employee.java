package fourth;

class Employee extends Person{
    String department;
    Employee(String s,String l){
        super(s);
        department = l;
    }

    @Override
    public String getName() {
        System.out.println("Employee name: "+ super.getName());
        return super.getName();
    }
}
