
/**
 * Jack Bennett
 * This program uses variables and the % operator to do clock arithmetic
 * December 14. 2016
 */
public class Pennies_Conversion
{
     public static void main(String[] args)
     {
         System.out.println("\fThis program will demonstrate making change.");
         
         int original_pennies=12947;
         int pennies = original_pennies;
         int nickels=0, dimes=0, quarters=0, ones=0, fives=0, tens=0, twenties=0;
         
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
         
         System.out.println("In "+original_pennies+" pennies, there are:");
         
         System.out.println("Twenties= "+twenties);
         System.out.println("Tens= "+tens);
         System.out.println("Fives= "+fives);
         System.out.println("Ones= "+ones);
         System.out.println("Quarters= "+quarters);
         System.out.println("Dimes= "+dimes);
         System.out.println("Nickles= "+nickels);
         System.out.println("Pennies= "+pennies);
        }
    }    
         
        