//Jack Bennett 
import java.util.*;
public class machineLoops2
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        Scanner kbString=new Scanner(System.in);
        String name, answer="yes";
        System.out.println("This program will demonsrate \"FOR\"loops.");
        int choice=0;
        while (choice != 5)
        {
            answer="yes";
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Please select an option from the following menu");
            System.out.println("1. Count from 1 to 10 using a FOR loop");
            System.out.println("2. Count from 10 to 1 using a FOR loop");
            System.out.println("3. Repeat a phrase using a FOR loop");
            System.out.println("4. Count from one number to any other number by 1's using a FOR loop");
            System.out.println("5. Quit");
            System.out.println(" ");
            choice=keyboard.nextInt();
            System.out.println(" ");
            
            //***************************Count from 1 to 10****************************
            if(choice==1)
            {
                for(int x=1;x<=10;x++)
                {
                    System.out.println(x);
                }//end of FOR loop
            }//ends choice 1
            
            //***************************Count from 10 to 1****************************
            if(choice==2)
            {
                for(int x=10;x>=1;x--)
                {
                    System.out.println(x);
                }//end of FOR loop 2
            }//end choice 2
            
            //***************************Repeat a phrase********************************
            if(choice==3)
            {
                System.out.println("Please enter a phrase you wish to repeat:");
                String phrase=kbString.nextLine();
                System.out.println("Please Enter the number of times you wish to repeat it:");
                int numRepeats=keyboard.nextInt();
                System.out.println(" ");
                for(int x=1; x<=numRepeats; x++)
                {
                    System.out.println(phrase);
                }//end of FOR loop 3
            }//end of Choice 3
            
            //**************************Count to any number*****************************
            if(choice==4)
            {
                System.out.println("Enter number to start at:");
                int number1=keyboard.nextInt();
                System.out.println("Enter a number to Count to:");
                int number2=keyboard.nextInt();
                System.out.println(" ");
                for(int x=number1; x<=number2; x++) 
                {
                    System.out.println(x);
                }
            }//ends choice 4
            
            //************************quit section******************************
            if(choice==5)
            {
                System.out.println("Thanks for using this program.");
            }//ends choice 5
          }//ends main
     }//ends the program
    }