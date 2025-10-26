
/**
 * Write a description of class Quizzly_Attempt here.
 *This class allows users to attempt a selected (entered using name) quiz
 * IshaanC_Java
 * 26/10/25
 */
import java.io.*;
public class Quizzly_Attempt{
    public void attempt()throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(isr);
        int score=0;
        System.out.print("Enter the quiz you want to attempt: ");
        String filename=bf.readLine()+".txt";
        Quizzly_Functionality ob1=new Quizzly_Functionality();

        System.out.println("Your score is: "+ob1.function(filename,score));
    }
    
}

