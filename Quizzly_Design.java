
/**
 * Write a description of class Quizzly_Design here.
 *This program aims to allow the user to design his/her own quiz having n number of questions with n number of options. 
 *Options shall be taken in type String. However, the user(candidate) shall only require to enter the character/option
 *A randomizer from the main app program may be used to prevent cheating
 *The quiz shall be stored to a file <<user defined name>>.txt. 
 *No of q->q1->No of options->**All questions and options written to the file** ->Correct ans stored in Design_Answers.txt
 * @author Ishaan Chakraborty
 * @version 19/10/25
 */
import java.io.*;
public class Quizzly_Design{
    public void design()throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(isr);
        System.out.print("Enter quiz name: ");
        String name=bf.readLine();
        System.out.print("Enter the number of questions: ");
        int n=Integer.parseInt(bf.readLine());
        
        FileWriter fw=new FileWriter(name+".txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        
        for(int i=0;i<n;i++){
            System.out.print("Enter the question: ");
            pw.print(bf.readLine()+"|");
            System.out.print("Enter the number of options: ");
            int no=Integer.parseInt(bf.readLine());
            for(int j=0;j<no;j++){
                System.out.print("Enter option " +(j+1)+": ");
                pw.print((j+1)+"."+bf.readLine()+" ");
            }
            System.out.print("Enter the correct option: ");
            pw.println(bf.readLine());
        }
        pw.close();
        System.out.println("YOUR QUIZ HAS BEEN CREATED. THANK YOU.");
    }
}
