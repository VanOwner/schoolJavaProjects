import java.util.*;

public class wishList2
{
    public static void main(String[]args)
    {
       Scanner kbReader=new Scanner(System.in);  //handles numbers
       Scanner kbString=new Scanner(System.in);  //handles words
       System.out.println("\f");  //clears screen, formfeed
       System.out.println("Welcome to the Wishlist Program");
       System.out.println("Please enter your top 5 gift wishes");
       System.out.println("Please enter wish #1");
       String wish1;  //creates a word stroa
       
       wish1 = kbString.nextLine();
       System.out.println("How much does it cost");
       double costOfWish1=0;
       costOfWish1 = kbReader.nextDouble();
       
       System.out.println("Please enter wish #2");
       String wish2;
       wish2 = kbString.nextLine();
       System.out.println("How much does it cost");
       double costOfWish2=0;
       costOfWish2 = kbReader.nextDouble();
       
       System.out.println("Please enter wish #3");
       String wish3;
       wish3 = kbString.nextLine();
       System.out.println("How much does it cost");
       double costOfWish3=0;
       costOfWish3 = kbReader.nextDouble();
       
       System.out.println("Please enter wish #4");
       String wish4;
       wish4 = kbString.nextLine();
       System.out.println("How much does it cost");
       double costOfWish4=0;
       costOfWish4 = kbReader.nextDouble();
       
       System.out.println("Please enter wish #5");
       String wish5;
       wish5 = kbString.nextLine();
       System.out.println("How much does it cost");
       double costOfWish5=0;
       costOfWish5 = kbReader.nextDouble();
       
       System.out.println("Here are your wishes");
       System.out.println(wish1 +"\t\t$"+costOfWish1);
       System.out.println(wish2 +"\t\t$"+costOfWish2);
       System.out.println(wish3 +"\t\t$"+costOfWish3);
       System.out.println(wish4 +"\t\t$"+costOfWish4);
       System.out.println(wish5 +"\t\t$"+costOfWish5);
       double total= costOfWish1+costOfWish2+costOfWish3+costOfWish4+costOfWish5;
       System.out.println("For a Grand total of $"+total);
    
    }
}    