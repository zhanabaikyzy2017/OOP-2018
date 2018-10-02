package third;

class Employee extends Person{
    private double salary;
    private int year;
    private String insuranceNumber;
    Employee(String name,double salary,int year,String s){
        super(name);
        this.salary = salary;
        this.year = year;
        this.insuranceNumber = s;
    }
    public double getSalary(){return salary;}
    public String getInsuranceNumber(){return insuranceNumber;}
    public int getYear(){return year;}
    public void setInsuranceNumber(String s){insuranceNumber = s;}
    public void setSalary(double i){salary = i;}
    public void setYear(int k) {year = k;}

    @Override
    public String ToString() {
        return super.ToString() + " " +this.salary+" "+this.year+" "+this.insuranceNumber;
    }

    @Override
    public boolean equals(Object p) {
       if(p == this) return true;
       Employee e = (Employee) p;
       return super.equals(p)&&
               e.salary == this.salary&&
               e.year == this.year&&
               e.insuranceNumber == this.insuranceNumber;

    }

}
