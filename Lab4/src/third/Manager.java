package third;

import java.util.Date;

class Manager extends Employee implements Comparable,Cloneable {
    private int bonus;
    private Employee[] team;

    Manager(String name, double salary, Date year, String s, Employee[]emp){
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
        if(o != this) return false;
        Manager m = (Manager)o;
        return super.equals(o)&&
                m.bonus == this.bonus&&
                m.team == this.team;
    }
    @Override
    public String ToString() {
        return super.ToString() + " "+ bonus ;
    }

    @Override
    public int compareTo(Object o) {
        Manager m = (Manager)o;
        if(super.compareTo(o) == 0){
            if(this.bonus>m.getBonus()){
                return 1;
            }if(this.bonus<m.getBonus()){
                return -1;
            }else {
                return 0;
            }
        }
        return super.compareTo(o);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Manager m = (Manager) super.clone();
        m.bonus = this.getBonus();
        m.team = this.getEmployees();

        return m;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getBonus();
    }
}
