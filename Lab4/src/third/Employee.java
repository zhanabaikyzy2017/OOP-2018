package third;

import java.util.Date;

class Employee extends Person implements Comparable,Cloneable {
    private double salary;
    private Date year;
    private String insuranceNumber;
    Employee(){
        super();
    }

    Employee(String name,double salary,Date year,String s){
        super(name);
        this.salary = salary;
        this.year = year;
        this.insuranceNumber = s;
    }
    public double getSalary(){return salary;}
    public String getInsuranceNumber(){return insuranceNumber;}
    public Date getYear(){return year;}
    public void setInsuranceNumber(String s){insuranceNumber = s;}
    public void setSalary(double i){salary = i;}
    public void setYear(Date k) {year = k;}

    @Override
    public String ToString() {
        return super.ToString() + " " +this.salary+" "+this.year+" "+this.insuranceNumber;
    }

    @Override
    public boolean equals(Object p) {
        //if(p == this) return true;
        Employee e = (Employee) p;
        return super.equals(p)&&
                e.salary == this.salary&&
                e.year == this.year&&
                e.insuranceNumber == this.insuranceNumber;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee)o;
        if(this.salary>e.salary){
            return 1;
        }if(this.salary<e.salary){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee e = new Employee();
        e.name = this.getName();
        e.salary = this.getSalary();
        e.insuranceNumber = this.getInsuranceNumber();
        e.year = this.getYear();
        return e;
    }
}

