import java.util.*;

public class mathQuiz
{
    public static void main(String[]args)
    { 
        Scanner keyboard=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Welcome to the Math Quiz program.");
        int numRight=0; //The # of correctly answered questions
        
        System.out.println("Question #1: what is 2 + 2?");
        int answer1=keyboard.nextInt();
        if(answer1 == 4)
        {
            System.out.println("You dun goofed!");
            numRight=numRight+1;
        }
        else
        {
            System.out.println("Are you dumb, the correct answer is 4");
        }
        System.out.println("Question #2: What is 3 * 7");
        int answer2=keyboard.nextInt();
        if(answer2 == 21)
        {
            System.out.println("Alright you got it");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was 21");
        }
        System.out.println("Question #3: What is 2 * 2");
        int answer3=keyboard.nextInt();
        if(answer3 == 4)
        {
            System.out.println("Alright you got it");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was 4");
        }
        System.out.println("Question #4: What is 2 * 3");
        int answer4=keyboard.nextInt();
        if(answer4 == 6)
        {
            System.out.println("Alright you got it");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was 6");
        }
        System.out.println("Question #5: What is 2 * 4");
        int answer5=keyboard.nextInt();
        if(answer5 == 8)
        {
            System.out.println("Alright you got it");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was 8");
        }
        System.out.println("Question #6: What is 2 * 5");
        int answer6=keyboard.nextInt();
        if(answer6 == 10)
        {
            System.out.println("Alright you got it");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was 10");
        }
        System.out.println("Question #7: What is 2 * 6");
        int answer7=keyboard.nextInt();
        if(answer7 == 12)
        {
            System.out.println("Alright you got it");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was 11");
        }
        System.out.println("Question #8: What is 2 * 7");
        int answer8=keyboard.nextInt();
        if(answer8 == 14)
        {
            System.out.println("Alright you got it");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was 14");
        }
        System.out.println("Question #9: What is 2 * 8");
        int answer9=keyboard.nextInt();
        if(answer9 == 16)
        {
            System.out.println("Alright you got it");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was 16");
        }System.out.println("Question #10: What is 2 * 9");
        int answer10=keyboard.nextInt();
        if(answer10 == 18)
        {
            System.out.println("Alright you got it");
            numRight++;
        }
        else
        {
            System.out.println("Sorry, but the right answer was 18");
        }
        //=========================== 1 point for each answer you correct ask up to ten.
        
        System.out.println("Here is your grade for the math quiz.");
        System.out.println("You scored "+numRight+" out of 10 possible.");
        
        if(numRight==10)
        {
            System.out.println("Your letter grade is an A");
        }
        if(numRight==9)
        {
            System.out.println("Your letter grade is an A-");
        }
        if(numRight==8)
        {
            System.out.println("Your letter grade is an B+");
        }
         if(numRight==7)
        {
            System.out.println("Your letter grade is an B");
        }if(numRight==6)
        {
            System.out.println("Your letter grade is an B-");
        }
        if(numRight==5)
        {
            System.out.println("Your letter grade is an C+");
        }
        if(numRight==4)
        {
            System.out.println("Your letter grade is an C");
        }
        if(numRight==3)
        {
            System.out.println("Your letter grade is an C-");
        }if(numRight==2)
        {
            System.out.println("Your letter grade is an D");
        }
        if(numRight==1)
        {
            System.out.println("Your letter grade is an D-");
        }
        if(numRight==0)
        {
            System.err.println("You FAILED go back to kindergarten");
        }
    }
}
            
            
       
     