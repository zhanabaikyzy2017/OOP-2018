class Time{
    private int hour;
    private int min;
    private int sec;

    Time(int a, int b, int c){
        this.sec = c;
        if(this.sec >= 60){
            this.sec = this.sec%60;
            this.min++;
        }
        this.min = b;
        if(this.min >= 60){
            this.min = this.min%60;
            this.hour++;
        }
        this.hour = a%24;
    }

    public String toUniversal(){

        String res = "";
        String unhour = Integer.toString(hour);
        String unmin = Integer.toString(min);
        String unsec = Integer.toString(sec);


        if(unhour.length() == 2){
            res = res+unhour ;
        }else{
            res = res +"0"+ unhour ;
        }
        res = res + ":";

        if(unmin.length() == 2){
            res= res + unmin ;
        }else{
            res = res + "0" + unmin ;
        }

        res = res + ":";
        if(unsec.length() == 2){
            res = res + unsec ;
        }else{
            res = res + "0" + unsec ;
        }


        return res;

    }
    public String toStandard(){
        String res = "";
        boolean ok = false;
        if(hour>13){
            hour = hour%12;
            ok = true;
        }
        String sh = Integer.toString(hour);
        String smin = Integer.toString(min);
        String ssec = Integer.toString(sec);
        if(sh.length() == 2){
            res = res+sh ;
        }else{
            res = res +"0"+ sh;
        }
        res = res + ":";

        if(smin.length() == 2){
            res= res + smin ;
        }else{
            res = res + "0" + smin ;
        }

        res = res + ":";
        if(ssec.length() == 2){
            res = res + ssec ;
        }else{
            res = res + "0" + ssec;
        }


        if(!ok){
            res = res + " AM";
        }else
            res = res + " PM";


        return res;
    }

    public void Add(Time t2){
        this.sec+=t2.sec;
        if(this.sec>60){
            this.sec = this.sec%60;
            this.min++;
        }
        this.min+=t2.min;
        if(this.min>60) {
            this.min = this.min % 60;
            this.hour++;
        }
        this.hour = (this.hour+ t2.hour) % 24;

    }

}

 class Problem4 {
    public static void main(String [] args){
        Time t1 = new Time(14,23,22);

        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());

        Time t2 = new Time(14,4,6);
        System.out.println(t2.toUniversal());
        System.out.println(t2.toStandard());

        t1.Add(t2);

        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());



    }
}
