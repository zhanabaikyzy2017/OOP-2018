package third;

class Person implements Cloneable,Comparable{
    public String name;
    Person(String n){
        this.name = n;
    }
    Person(){}
    public String getName() {return name;}
    public void srtName(String s) {this.name = s;}

    public String ToString(){
        return this.name;
    }

    public boolean equals(Object p){
        // if(p == this) return true;
        Person person = (Person)p;
        return person.name == this.name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

