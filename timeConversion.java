import java.util.*;
/**
 * Jack Bennett
 * This program uses variables and the % operator to do clock arithmetic
 * December 14. 2016
 */
public class timeConversion
{
     public static void main(String[] args)
     {
         Scanner keyboard=new Scanner(System.in);
         Scanner kbString=new Scanner(System.in);
         System.out.println("\fThis program will demonstrate time conversion.");
         System.out.println("Please enter an integer.");
         
         int original_seconds = keyboard.nextInt();
         int seconds = original_seconds;
         int minutes=0;
         int hours=0;
         int days=0;
         int weeks=0;
         int years=0;
         
         years=seconds/(60 * 60 * 24 * 365);
         seconds=seconds%(60 * 60 * 24 * 365);
         
         weeks=seconds/(60 * 60 * 24 * 7);
         seconds=seconds%(60 * 60 * 24 * 7);
         
         days=seconds/(60 * 60 * 24);
         seconds=seconds%(60 * 60 * 24);
         
         hours=seconds/(60 * 60);
         seconds=seconds%(60 * 60);
                
         minutes=seconds/60;
         seconds=seconds%60;
                                         
         System.out.println("Seconds= "+seconds);
         System.out.println("Minutes= "+minutes);
         System.out.println("hours= "+hours);
         System.out.println("days= "+days);
         System.out.println("weeks= "+weeks);
         System.out.println("years= "+years);
         
        }
    }    
         
        