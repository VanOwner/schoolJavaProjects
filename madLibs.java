//MadLibs program, Jack Bennett, version 1.0
import java.util.*;
public class madLibs
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        Scanner kbString=new Scanner(System.in);
        String adj1;
        String noun1;
        String noun2;
        String verb1;
        String liq1;
        String liq2;
        String liq3;
        String color1;
        String verb2;
        String verb3;
        int num1 = 0;
        String adj2;
        String adv1;
        String bodyparts;
        String verb4;
        String verb5;
        //end of ints and stuff
        System.out.println("Welcome to the the madlibs program");
        System.out.println("Please enter as follows");
        System.out.println(" ");
        //
        System.out.println("Please enter an Adjective ");
        adj1=kbString.nextLine();
        System.out.println("you chose "+adj1);
        System.out.println(" ");
        //
        System.out.println("Please enter a noun");
        noun1=kbString.nextLine();
        System.out.println("you entered "+noun1);
        System.out.println(" ");
        //
        System.out.println("Please enter another noun");
        noun2=kbString.nextLine();
        System.out.println("you entered "+noun2);
        System.out.println(" ");
        //
        System.out.println("Please enter a verb");
        verb1=kbString.nextLine();
        System.out.println("you entered "+verb1);
        System.out.println(" ");
        //
        System.out.println("Please enter a Liquid");
        liq1=kbString.nextLine();
        System.out.println("you entered "+liq1);
        System.out.println(" ");
        //
        System.out.println("Please enter another Liquid");
        liq2=kbString.nextLine();
        System.out.println("you entered "+liq2);
        System.out.println(" ");
        //
        System.out.println("Please enter a third liquid");
        liq3=kbString.nextLine();
        System.out.println("you entered "+liq3);
        System.out.println(" ");
        //
        System.out.println("Please enter a color");
        color1=kbString.nextLine();
        System.out.println("you entered "+color1);
        System.out.println(" ");
        //
        System.out.println("Please enter a verb");
        verb2=kbString.nextLine();
        System.out.println("you entered "+verb2);
        System.out.println(" ");
        //
        System.out.println("Please enter another verb");
        verb3=kbString.nextLine();
        System.out.println("you entered "+verb3);
        System.out.println(" ");
        //
        System.out.println("Please enter a number");
        num1=keyboard.nextInt();
        System.out.println("you entered "+num1);
        System.out.println(" ");
        //
        System.out.println("Please enter a adjective");
        adj2=kbString.nextLine();
        System.out.println("you entered "+adj2);
        System.out.println(" ");
        //
        System.out.println("Please enter a adverb");
        adv1=kbString.nextLine();
        System.out.println("you entered "+adv1);
        System.out.println(" ");
        //
        System.out.println("Please enter a body part that is plural");
        bodyparts=kbString.nextLine();
        System.out.println("you entered "+bodyparts);
        System.out.println(" ");
        //
        System.out.println("Please enter a verb");
        verb4=kbString.nextLine();
        System.out.println("you entered "+verb4);
        System.out.println(" ");
        //
        System.out.println("Please enter a verb");
        verb5=kbString.nextLine();
        System.out.println("you entered "+verb5);
        System.out.println(" ");
        //end of typing in
        System.out.println(" ");
        System.out.println("To make "+adj1+" ice cubes, first find a tray with molds shaped like a "+noun1+" or a "+noun2+".");
        System.out.println("Then "+verb1+" once while holding the tray. Fill the molds with "+liq1+", ");
        System.out.println("or even "+liq2+", but for the best results always use "+liq3+".");
        System.out.println("It can even be dyed "+color1+" if you wish. "+verb2+" carefully when placing the try in the freezer.");
        System.out.println("Allow the cubes to "+verb3+" for at least "+num1+" minutes until they are completely "+adj2+". ");
        System.out.println("Remove the tray "+adv1+", and jiggle with your "+bodyparts+" until the cubes "+verb4+". Add to your favorite drink and "+verb5+"!");
    }
}

        
        
        
        
        
        
        
        
        
        
   