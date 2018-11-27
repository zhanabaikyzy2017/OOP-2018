package second;

public class customer {
    private String name;
    private boolean member;
    private String memberType;
    public customer(String name){
        this.name = name;
        member = false;
    }
    public String getName(){return this.name;}
    public void setName(String s){this.name = s;}
    public  boolean isMember(){return this.member;}

    public void setMember(boolean member) {
        this.member = member;
    }
    public String getMemberType(){return this.memberType;}
    public void setMemberType(String s){this.memberType = s;}

    @Override
    public String toString() {
        return name + memberType +"";
    }
}
