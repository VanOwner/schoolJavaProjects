import java.util.*;

/**
 * Jack Bennett
 * This program uses variables and the % operator to do base conversions
 * December 15. 2016
 */
public class base_Conversion
{
     public static void main(String[] args)
     {
         Scanner kbReader = new Scanner(System.in);
         
         System.out.println("\fThis program will convert base 10 to base 2.");

         int original_num=0;
         
         do
        {
            System.out.println("Please enter a number between 0 and 225");
            original_num=kbReader.nextInt();
        } while ((original_num>0)||(original_num<255));
        
        
        int num = original_num;
        int ones=0, twos=0, fours=0, eights=0, sixteens=0, thirtyTwos=0, sixtyFours=0, oneTwentyEights=0;
        
         oneTwentyEights=num/128;
         num=num%128;
         
         sixtyFours=num/64;
         num=num%64;
         
         thirtyTwos=num/32;
         num=num%32;
         
         sixteens=num/16;
         num=num%16;
         
         eights=num/8;
         num=num%8;
         
         fours=num/4;
         num=num%4;
         
         twos=num/2;
         ones=num%2;
         
         System.out.println("The number "+original_num+" converts to ");
         
         System.out.print(oneTwentyEights);
         System.out.print(sixtyFours);
         System.out.print(thirtyTwos);
         System.out.print(sixteens+"  ");
         System.out.print(eights);
         System.out.print(fours);
         System.out.print(twos);
         System.out.println(ones);
                  
         System.out.println("Thanks for using this program");
        }
    }    
         
        