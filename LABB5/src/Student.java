public class Student implements Comparable{
    private String surname;
    private String name;
    private int score;
    private Character grade ;

    public Student(){
        surname = "";
        name = "";
        grade = 'F';
        score = 0;
    }
    public Student(String s, String n, int score){
        surname = s;
        name = n;
        this.score = score;
        grade = 'F';
    }
    public String getSurname(){return surname;}
    public String getName(){return name;}
    public int getScore(){return score;}
    public Character getGrade(){return grade;}

    public void setSurname(String s){surname = s;}
    public void setName(String s){name = s;}
    public void setScore(int s){score  = s;}
    public void setGrade(Character c){grade = c;}

    public int compareTo(Object obj) {
        Student s = (Student)obj;
        if(this.score > s.score) return 1;
        else if(this.score < s.score) return -1;
        else return 0;
    }
}
