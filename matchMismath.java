import java.util.*;
/**
 */
public class matchMismath
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random melvin = new Random();
        double money=2.00;
        String playAgain="no";
        System.out.println("Welcome to Match Mismatch. The computer will flip two coins.");
        System.out.println("You are to predict if the quarters will match(Both be heads or both be tails) or mismatch");
        System.out.println("You will start off with $"+money+" in the bank");
        
        do
        {
            int num1=melvin.nextInt(2), num2=melvin.nextInt(2);
            System.out.println("Please anter your guess: Match or Mismatch");
            String answer = keyboard.nextLine();
            System.out.println("Here we go.....");
            System.out.println("The computer rolled a ");
            if(num1==0)
            {
                System.out.println("Heads");
            }
            else
            {
                System.out.println("Tails");
            }
            
            System.out.println("and a ");
            if(num2==0)
            {
                System.out.println("Heads");
            }
            else
            {
                System.out.println("Tails");
            }
            
            
            //======================================================================================================
            if(answer.equalsIgnoreCase("match"))
            {
                if(num1==num2)
                {
                    System.out.println("You WIN!");
                    money += 0.25;
                    System.out.println("You now have $"+money+" in the bank");
                }//end of win portion
                else
                {
                    System.out.println("You LOSE! Better luck next time");
                    money=money-0.25;
                    System.out.println("You now have $"+money+" in the bank");
                }//end of lose portion
            }//end of match portion
            else
            {
                if(num1==num2)
                {
                    System.out.println("You LOSE! Better luck next time");
                    money=money-0.25;
                    System.out.println("You now have $"+money+" in the bank");
                }//end of lose portion
                else
                {
                    System.out.println("You WIN!");
                    money += 0.25;
                    System.out.println("You now have $"+money+" in the bank");
                }//end of win portion
            }//end of Mismatch portion
            
            //================================================================================================
            System.out.println("Do you want to play again?");
            playAgain=keyboard.nextLine();
        }while (playAgain.equalsIgnoreCase("yes"));
        System.out.println("Thanks for playing!!");
    }
}
    
               