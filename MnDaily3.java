import java.util.*;
public class MnDaily3
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Scanner kbString = new Scanner(System.in);
        Random generator = new Random();
        int winnings=365,pick = generator.nextInt(1000),answer=2000,dayNum=1;
        String keepGoing="yes";
        boolean STOP=false;
        
        System.out.println("Welcome to the Jacktopia Daily 3 lottery. Let's begin");
        do
        {
            do
            {
                System.out.println("Please enter your 3 digit lottery pick");
                answer=keyboard.nextInt();
            }while ((answer<0)||(answer>=1000));//End of getting their pick between 000 and 999
            
            do
            {
                if(answer==pick)
                {
                    System.out.println("You Win!!!");
                    winnings+=500;
                    STOP=true;
                }//end of win section
                else
                {
                    winnings--;
                    System.out.println("Sorry, but the winning number was "+pick+".");
                }//end of lose section
                
                System.out.println("On day #"+dayNum+",you have $ "+winnings+".");
                dayNum++;
                pick= generator.nextInt(1000);
            } while (STOP==false); //end of game loop
            System.out.println("Would you like to keep playing? (yes or no)");
            keepGoing= kbString.nextLine();
            STOP=false;
            } while (keepGoing.equalsIgnoreCase("yes"));
        }
    }
     