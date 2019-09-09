import java.util.*;
/**
*
*/
public class starLoops{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name, answer="yes";
        int choice=0;
        while (choice != 7)
        {
            answer="yes";
            System.out.println("");
            System.out.println("");
            System.out.println("==========================================");
            System.out.println("|             MAIN MENU                  |");
            System.out.println("==========================================");
            System.out.println("|      Options:                          |");
            System.out.println("|      1. Rectangle                      |");
            System.out.println("|      2. Right facing right triangle    |");
            System.out.println("|      3. Left facing right triangle     |");
            System.out.println("|      4. Isosceles triangle             |");
            System.out.println("|      5. Parallelogram                  |");
            System.out.println("|      6. Diamond                        |");
            System.out.println("|      7. Exit                           |");
            System.out.println("==========================================");
            System.out.println("");
            System.out.println("");
            
            choice=keyboard.nextInt();
            System.out.println("");

            //************** Rectangle **************
            if(choice==1)
            {
                System.out.println("Please enter the number of stars per row:");
                int numStars=keyboard.nextInt();
                System.out.println("Please enter the number Of Rows in your rectangle:");
                int numRows=keyboard.nextInt();
                for(int x=1; x<=numRows; x++)
                {
                    for(int y=1; y<=numStars; y++)
                    {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
            //************** Right-facing right triangle **************
            if(choice==2)
            {
                System.out.println("Please enter the number of rows in your triangle");
                int numRows=keyboard.nextInt();
                for(int x=1; x<=numRows; x++)
                {
                    for(int y=1; y<=x; y++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
            //************** left-facing right triangle **************
            if(choice==3){
                System.out.println("Please enter the number of rows in your triangle");
                int numRows=keyboard.nextInt();
                for(int x=1; x<=numRows; x++)
                {
                    for(int y=1; y<=numRows-x; y++)
                    {
                        System.out.print(" ");
                    }
                    for(int y=1; y<=x; y++)
                    {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
              //=====isosceles =============
            if(choice==4){
                System.out.println("Please enter a number of rows in your triangle");
                int numRows=keyboard.nextInt();
                for(int x=0; x<=numRows; x++){
                    for(int y=1; y<=numRows-x; y++){
                        System.out.print(" ");
                    }
                    for(int y=0; y<=x; y++){
                        System.out.print("*");
                    }
                    for(int y=1; y<=x; y++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
            //==================paralogram========================
            if(choice==5){

                System.out.println("Please enter a number of rows in your paralellegram");
                int numRow=keyboard.nextInt();
                System.out.println("How many stars");
                int stars=keyboard.nextInt();
                for(int x=0; x<numRow; x++){
                    for(int y=0; y<stars; y++){
                        System.out.print("*");
                    }
                    System.out.println();
                    for(int w=0; w<=x; w++){
                        System.out.print(" ");
                    }
                }
            }
            //==================Diamond========================
            if(choice==6){
                System.out.println("Please enter the number of rows");
                int numRow=keyboard.nextInt();
                System.out.println("How many colums");
                int collom=keyboard.nextInt();
                int nos = numRow/2; 
                for (int x = 1; x <= numRow; x++) { 
                    for (int y = nos; y >= 1; y--) { 
                        System.out.print(" ");
                    }
                    for (int y = 1; y <= collom; y++) { 
                        System.out.print("*");
                    }
                    System.out.println();
                    if (x < numRow/2+1) {
                        collom += 2;
                        nos -= 1; 
                    } else {
                        collom -= 2; 
                        nos += 1; 
                    }
                }
            }
            if(choice==7)
            {
                System.out.println("Thanks for using the program");
            }
        }
    }
}


