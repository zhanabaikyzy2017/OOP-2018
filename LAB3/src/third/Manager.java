package third;

class Manager extends Employee {
    private int bonus;
    private Employee[] team;

    Manager(String name,double salary,int year,String s,Employee[]emp){
        super(name,salary,year,s);
        this.bonus = 0;
        this.team = emp;

    }
    public int getBonus(){return bonus;}
    public Employee[] getEmployees(){return this.team;}

    public void setBonus(int i){bonus = i;}
    public void setTeam(Employee [] k) {this.team = k;}

    @Override
    public boolean equals(Object o) {
        if(o == this) return true;
        Manager m = (Manager)o;
        return /*super.equals(o)&&*/
                m.bonus == this.bonus&&
                m.team == this.team;
    }
    @Override
    public String ToString() {
        return super.ToString() + " "+ bonus ;
    }
}
