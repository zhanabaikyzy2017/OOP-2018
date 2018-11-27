package first;
class Dog extends Animal{
    private String color;

    public Dog(){
        super();
        color = "no color";
    }

    public Dog(String n, String c){
        super(n);
        color = c;
    }

    public String getColor(){return color;}
    public void setColor(String s){this.color = s;}

    @Override
    public void Show() {
        super.Show();
        System.out.println(getColor());
    }


}
