import java.util.*;

public class newYears
{
    public static void main(String[]args)
    {
       Scanner kbString=new Scanner(System.in);  //handles words
       System.out.println("\f");  //clears screen, formfeed
       System.out.println("Welcome to the NewYears Resolution Program");
       System.out.println("Please enter your top 5 Resolutions");
       
       System.out.println("Please enter Resolution #1");
       String Resolution1;  //creates a word string
       Resolution1 = kbString.nextLine();
       
       System.out.println("Please enter Resolution #2");
       String Resolution2;
       Resolution2 = kbString.nextLine();
       
       System.out.println("Please enter Resolution #3");
       String Resolution3;
       Resolution3 = kbString.nextLine();
          
       System.out.println("Please enter Resolution #4");
       String Resolution4;
       Resolution4 = kbString.nextLine();
              
       System.out.println("Please enter Resolution #5");
       String Resolution5;
       Resolution5 = kbString.nextLine();
       
       System.out.println("");
       System.out.println("");
       System.out.println("Here are your Resolutions");
       System.out.println(Resolution1 +"\t\t$");
       System.out.println(Resolution2 +"\t\t$");
       System.out.println(Resolution3 +"\t\t$");
       System.out.println(Resolution4 +"\t\t$");
       System.out.println(Resolution5 +"\t\t$");
        }
}    