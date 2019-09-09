import java.util.*;

/**
 * Jack Bennett
 * This program uses variables and the % operator to do base conversions
 * December 15. 2016
 */
public class pennies_Conversion2
{
     public static void main(String[] args)
     {
         Scanner kbReader = new Scanner(System.in);
        
         int original_pennies=0;
         
         do
        {
            System.out.println("Please enter an amount pennies above 0");
            original_pennies=kbReader.nextInt();
        } while ((original_pennies<0));
    
        
        int pennies = original_pennies;
        int nickels=0, dimes=0, fours=0, quarters=0, ones=0, fives=0, tens=0, twenties=0;
        
         twenties=pennies/2000;
         pennies=pennies%2000;
         
         tens=pennies/1000;
         pennies=pennies%1000;
         
         fives=pennies/500;
         pennies=pennies%500;
         
         ones=pennies/100;
         pennies=pennies%100;
         
         quarters=pennies/25;
         pennies=pennies%25;
         
         dimes=pennies/10;
         pennies=pennies%10;
         
         nickels=pennies/5;
         pennies=pennies%5;
         
         System.out.println("The penniesber "+original_pennies+" converts to ");
         
         System.out.println("Twenties= "+twenties);
         System.out.println("Tens= "+tens);
         System.out.println("Fives= "+fives);
         System.out.println("Ones= "+ones);
         System.out.println("Quarters= "+quarters);
         System.out.println("Dimes= "+dimes);
         System.out.println("Nickels= "+nickels);
         System.out.println("Pennies= "+pennies);
                  
         System.out.println("Thanks for using this program");
        }
    }    
         
        