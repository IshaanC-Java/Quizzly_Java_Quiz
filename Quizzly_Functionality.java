
/**
 * Write a description of class Quizzly_Functionality here.
 * This is a class that establishes the functionality of the quiz application.
 * It presents the question, the options, and takes in the answers. It cross checks the answer and increments score.
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
public class Quizzly_Functionality{
    public int function(String name,int score)throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(isr);
        String txt="";
        String quizname=name;
        FileReader fr=new FileReader(quizname);
        BufferedReader br=new BufferedReader(fr);
        while((txt=br.readLine())!=null){
             String parts[]=txt.split("\\|");
        String q=parts[0],option=parts[1];
            System.out.println(parts[0]+"\n"+option);
            int ch=Integer.parseInt(bf.readLine());
            if(ch==Integer.parseInt(parts[2]))
            score++;
        }
        br.close();
fr.close();

        return score;
  

    }
}

