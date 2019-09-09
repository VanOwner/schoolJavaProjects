import java.util.*;
public class boxing
{
   public static void main(String[]args)
   {
       Scanner kb = new Scanner(System.in);
       String name;
       int weight;
       System.out.println("Welcome to the boxer weight program this program will tell you what class your boser is in");
       System.out.println("Please enter your boxers name:");
       name=kb.nextLine();
       System.out.println("now enter your boxers weight:");
       weight=kb.nextInt();
       if(weight<=102)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is light minimum weight");
       }
       else if(weight<=105)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is minimum weight");
       }
       else if(weight<=108)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is light flyweight");
       }
       else if(weight<=112)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is flyweight");
       }
       else if(weight<=115)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is super flyweight");
       }
       else if(weight<=118)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is batamweight");
       }
       else if(weight<=122)
       {
           System.out.println("Your boxers name is:"+name);
           System.out.println("Your boxers weight is"+weight);
           System.out.println("your boxer is super batamweight");
       }
       else if(weight<=126)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is featherweight");
       }
       else if(weight<=130)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is super featherweight");
       }
       else if(weight<=135)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is lightweight");
       }
       else if(weight<=140)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is super lightweight");
       }
       else if(weight<=147)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is welterweight");
       }
       else if(weight<=154)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is super welterweight");
       }
       else if(weight<=160)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is middleweight");
       }
       else if(weight<=168)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is super middleweight");
       }
       else if(weight<=175)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is light heavyweight");
       }
       else if(weight<=200)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is cruiserwight");
       }
       else if(weight>200)
       {
           System.out.println("Your boxers name is "+name);
           System.out.println("Your boxers weight is "+weight);
           System.out.println("your boxer is cruiserwight");
       }
    }
}
       
       