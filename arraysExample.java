import java.util.*;
import java.io.*;

public class arraysExample
{
    public static void main(String[] args) throws IOException
    {
        Scanner kb = new Scanner(System.in);
        System.out.println( "Welcome to your address book" );

        String name[]= new String[6];
        String phone[]= new String[6];

        while (choice != 2)
        {
            if(choice==1)
            {   
                System.out.println( "Please enter the following information for 5 friends ");
                for (int x =1; x<=5; x++)
                {
                    System.out.println("Please enter friend #"+x+" first name");
                    name[x]=kb.nextLine();
                    System.out.println("Please enter friend #"+x+" phone number");
                    phone[x]=kb.nextLine();
                }

                System.out.println( "Here is your information for 5 friends ");
                for(int x=1; x<=5; x++)
                {
                    System.out.println( name[x]+"   "+phone[x]);
                }

                FileWriter fw = new FileWriter("Output2.out");
                PrintWriter output = new PrintWriter(fw);
                System.out.println( "now writing to file...");
                for(int x=1; x<=5; x++)
                {
                    output.println( name[x]);
                    output.println(phone[x]);
                }
            }
            if(choice==2)
            {
                String name[]= new String[6];
                String phone[]= new String[6];

                
                
                
                FileReader fileR = FileReader("Output2.out");
                Scanner inFile = new Scanner(fileR);
                System.out.println( "Now reader from file...");

                for(int x=1; x<=5; x++)
                {
                    nameInput[x]=inFile.nextLine();
                    phoneIn
                }

            }
            output.close( );
            fw.close( );

        }
    }
}