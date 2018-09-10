class StarTringle{
        int width;

        public StarTringle(int width){
            this.width = width;
        }
        public String ToString(){
            String shape = "[*]";
            String str = "";
            for(int i = 0; i < width; i++){
                for(int j = 0; j <=i; j++){
                    str = str + "" + shape;
                }
                str = str + "\n";
            }
            return str;
        }
    }

class Problem2 {
     public static void main(String[] args) {
        StarTringle star = new StarTringle(5);

        System.out.println(star.ToString());
         }
}
