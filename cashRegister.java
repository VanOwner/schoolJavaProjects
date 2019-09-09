//Jack Bennett Cash Register problem
import java.util.*;
public class cashRegister
{
    public static void main(String[]args)
    {
        Scanner keyboard=new Scanner(System.in);
        Scanner kbString=new Scanner(System.in);
        System.out.println("Welcome to the Cash Register program.");
        System.out.println("This program will help you how to function a cash register.");
        int largeitem = 0;
        int smallestitem = 10000000;
        int largestSubtotal = 0;
        int smallestSubtotal = 10000000;
        int itemTotal = 0;
        int dailyTotal = 0;
        int customerCounter = 1;
        String moreCustomers = "yes";
        int price = 0;
        do
        {
            System.out.println("Welcome to Jowalskis how can i help you.");
            int sub = 0;
            int itemCounter = 1;
            price=0;
            do
            {
                System.out.println("Please type -999 to end entering items.");
                
                System.out.println("What is the price ");
                price=keyboard.nextInt();
                if (price!=-999)
                {
                    if(price>largeitem)
                    {largeitem=price;
                    }
                    if(price<smallestitem)
                    {smallestitem=price;
                    }
                    sub=price+sub;
                    itemCounter++;
                }
            }while(price!=-999);
            System.out.println("Your subtotal is "+sub);
            
            if(sub>largestSubtotal)
            {largestSubtotal=sub;}
            if(sub<smallestSubtotal)
            {smallestSubtotal=sub;}
            dailyTotal=dailyTotal+sub-1;
            customerCounter++;
            System.out.println("Are there anymore Customers?");
            moreCustomers=keyboard.next();
        }while(moreCustomers.equalsIgnoreCase("yes"));
        
        System.out.println("Total sales "+dailyTotal);
        System.out.println("Number of items sold "+itemTotal);
        System.out.println("Number of customers "+customerCounter);
        System.out.println("The largest item sold "+largeitem);
        System.out.println("The smallest item sold "+smallestitem);
        System.out.println("Largest subtotal is "+largestSubtotal);
        System.out.println("Smallest subtotal is "+smallestSubtotal);
    }
}

