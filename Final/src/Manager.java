public class Manager extends Employee {
    private Type type;
    public Manager(){
        super();
    }
    public Manager(String id,String password,String name, double salary,Type type){
        super(id,password,name,salary);
        this.type = type;
    }
    public enum Type{
        OfficeREgister, Department;
    }
    public Type getType(){return type;}
    public void setType(Type t){
        this.type = t;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(!super.equals(o)) return false;
        Manager m = (Manager) o;
        return type == m.type;
    }
    public void update(){
        super.update();
        switch(type){
            case OfficeREgister :
                setType(Type.OfficeREgister);
                break;
            case Department:
                setType(Type.Department);
                break;
            default:
                break;
        }
    }



}
