import java.util.*;
 /**
 * Jack Bennett
 */
public class inchConversion
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        Scanner kbString=new Scanner(System.in);
        System.out.println("\fthis program does inch stuff");
        int original_inches = keyboard.nextInt();
        int inches=original_inches;
        int miles=0, yards=0, feet=0, inch=0;
        miles=inches/63360;
        inches=inches%63360;
        
        yards=inches/36;
        inches=inches%36;
        
        feet=inches/12;
        inches=inches%12;
        
        inch=inches/1;
        inches=inches%1;
        
        System.out.println("In "+original_inches+" inches there is");
        System.out.println("Miles= "+miles);
        System.out.println("Yards= "+yards);
        System.out.println("Feet= "+feet);
        System.out.println("Inch= "+inch);
     
    }
}


