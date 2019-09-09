import java.util.*;

public class randomMathQuiz
{
    public static void main(String[]args)
    { 
        Scanner keyboard=new Scanner(System.in);
        Random rndm = new Random();
        
        System.out.println("\f");
        System.out.println("Welcome to the Math Quiz program.");
        int numRight=0; //The # of correctly answered questions
        //============Start of Question #1======================
        int num1= rndm.nextInt(21)-10;
        int num2= rndm.nextInt(21)-10;
        
        System.out.print("Question #1: what is "+num1+" + "+num2+"?");
        int guess=keyboard.nextInt();
        int answer1=num1+num2;
        if(answer1 == guess)
        {
            System.out.println("You dun goofed!");
            numRight=numRight+1;
        }
        else
        {
            System.out.println("Are you dumb, the correct answer is "+answer1);
        }
        //===============Start of Question #2
        num1= rndm.nextInt(21)-10;
        num2= rndm.nextInt(21)-10;
        
        System.out.print("Question #2: What is "+num1+" + "+num2+"?");
        int answer2=keyboard.nextInt();
        if(answer2 == num1 + num2)
        {
            System.out.print("Alright you got it ");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was "+answer2);
        }
        System.out.print("Question #3: What is "+num1+" + "+num2+"?");
        int answer3=keyboard.nextInt();
        if(answer3 == 4)
        {
            System.out.println("Alright you got it ");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was "+answer3);
        }
        System.out.print("Question #4: What is "+num1+" + "+num2+"?");
        int answer4=keyboard.nextInt();
        if(answer4 == 6)
        {
            System.out.print("Alright you got it ");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was "+answer4);
        }
        System.out.print("Question #5: What is "+num1+" + "+num2+"?");
        int answer5=keyboard.nextInt();
        if(answer5 == 8)
        {
            System.out.println("Alright you got it ");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was "+answer5);
        }
        System.out.print("Question #6: What is "+num1+" + "+num2+"?");
        int answer6=keyboard.nextInt();
        if(answer6 == 10)
        {
            System.out.println("Alright you got it ");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was "+answer6);
        }
        System.out.print("Question #7: What is "+num1+" + "+num2+"?");
        int answer7=keyboard.nextInt();
        if(answer7 == 12)
        {
            System.out.println("Alright you got it ");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was "+answer7);
        }
        System.out.print("Question #8: What is "+num1+" + "+num2+"?");
        int answer8=keyboard.nextInt();
        if(answer8 == 14)
        {
            System.out.println("Alright you got it ");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was "+answer8);
        }
        System.out.print("Question #9: What is "+num1+" + "+num2+"?");
        int answer9=keyboard.nextInt();
        if(answer9 == 16)
        {
            System.out.println("Alright you got it ");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was "+answer9);
        }System.out.print("Question #10: What is "+num1+" + "+num2+"?");
        int answer10=keyboard.nextInt();
        if(answer10 == 18)
        {
            System.out.println("Alright you got it ");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was "+answer10);
        }
        //=========================== 1 point for each answer you correct ask up to ten.
        
        System.out.println("Here is your grade for the math quiz.");
        System.out.println("You scored "+numRight+" out of 10 possible.");
        
        if(numRight==10)
        {
            System.out.println("Your letter grade is an A");
        }
        if(numRight==9);
        {
            System.out.println("Your letter grade is an A-/B+");
        }
    }
}
            
            
       
     