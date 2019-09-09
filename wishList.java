import java.util.*;

public class wishList
{
   public static void main(String[] args)
   { 
       System.out.println("My holiday wishlist:");
       System.out.println("");
       System.out.println("I'm fat");
       System.out.println("i want candy");
       System.out.println("and more candy");
       System.out.println("than a mcdonalds giftcard");
       System.out.println("this is a joke haha kill me :'(");
       
       Scanner kbReader=new Scanner(System.in);  //Opens up access to the keyboard
       
       System.out.println("");
       System.out.println("");
       
       System.out.println("Now, Please tell me Your Wishlist");
       
       System.out.println("Please enter wish #1");
       String wish1=kbReader.nextLine();
       
       System.out.println("Please enter wish #2");
       String wish2=kbReader.nextLine();
       
       System.out.println("Please enter wish #3");
       String wish3=kbReader.nextLine();
       
       System.out.println("");
       System.out.println("");
       
       System.out.println("Here are your wishes");
       System.out.println(wish1);
       System.out.println(wish2);
       System.out.println(wish3);
       
             
   }
}
     