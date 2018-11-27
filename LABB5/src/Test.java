import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {
    public static void main(String args[]){
        try{
            ArrayList<Student> list = new ArrayList<Student>();
            int max =0;
            BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
            BufferedWriter bf = new BufferedWriter(new FileWriter("grades.txt"));

            String name, surname, line = br.readLine();
            int score;
            StringTokenizer token;
            while(line!=null) {
                token = new StringTokenizer(line, " ", false);
                surname = token.nextToken();
                name = token.nextToken();
                score = Integer.parseInt(token.nextToken());
                if (score > max) {
                    max = score;
                }
                Student s = new Student(surname, name, score);
                list.add(s);
                line = br.readLine();
            }

            //list.sort(null);
            int c = 0;
        for(int i = 0; i < list.size(); i++) {
            c += list.get(i).getScore();
            if (list.get(i).getScore() >= max - 10) {
                list.get(i).setGrade('A');
            }
            else if (list.get(i).getScore() >= max - 20 ){
                list.get(i).setGrade('B');
            }
            else if (list.get(i).getScore() >= max - 30 ) {
                list.get(i).setGrade('C');
            }
            else if (list.get(i).getScore() >= max - 40) {
                list.get(i).setGrade('D');
            } if(list.get(i).getScore() < max - 40) {
                list.get(i).setGrade('F');
            }
        }

            for(int i = list.size() - 1; i >= 0; i--) {
                bf.write(list.size() - i + ")" + list.get(i).getSurname() + " " + list.get(i).getName() + "-\"" + list.get(i).getGrade() + "\"");
                bf.newLine();
            }

            bf.write("Average: " + c/list.size());
            bf.newLine();
            bf.write("Maximum: " + list.get(list.size()- 1).getScore());
            bf.newLine();
            bf.write("Minimum: " + list.get(0).getScore());
            //bf.write(" " + max);
            br.close();
            bf.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
