import java.util.*;
import java.io.*;

public class top5SpringBreak
{
    public static void main(String[] args) throws IOException
    {
        Scanner kb = new Scanner(System.in);
        String top[]= new String[6];
        System.out.println("Welcome to the top 5 Spring break destination program");
        System.out.println("Please enter your top 5 Destinations");   
        for (int x =1; x<=5; x++)    
        {
            System.out.println("Please enter your #"+x+" Destination");  
            top[x]=kb.nextLine();
        }
        
        for(int x=1; x<=5; x++)
        {
            System.out.println(top[x]);
        }
    }
}