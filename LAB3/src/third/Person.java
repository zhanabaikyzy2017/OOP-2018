package third;

class Person {
    public String name;
    Person(String n){
        this.name = n;
    }

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


}
