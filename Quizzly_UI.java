
/**
 * Write a description of class Quizzly_UI here.
 *This class presents the choices to the user. 
 * @IshaanC_Java
 * @25/10/25
 */
import java.util.Scanner;
public class Quizzly_UI{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: \n1.Design a quiz\n2.Attempt a quiz");
        int ch=sc.nextInt();
        
        switch(ch){
            case 1: Quizzly_Design ob1=new Quizzly_Design();
            try
            {
                ob1.design();
            }
            catch (java.io.IOException ioe)
            {
                ioe.printStackTrace();
            }
                break;
            case 2: Quizzly_Attempt ob2=new Quizzly_Attempt();
            try
            {
                ob2.attempt();
            }
            catch (java.io.IOException ioe)
            {
                ioe.printStackTrace();
            }
            break;
            default: System.out.println("Invalid choice. Please try again.");
        }
        
    }
}
