;import java.util.*;

public class billOfRightsQuiz
{
    public static void main(String[] args)
    {
        Scanner kbString=new Scanner(System.in);
        System.out.println("\fWelcome to my bill of rights quiz program.");
        
        String answer;
        int numRight=0;
        
        do
        {
            System.out.println("Question 1 When was the bill of rights added to the constitution");
            
            System.out.println("A) 1741");
            System.out.println("B) 1789");
            System.out.println("C) 1748");
            System.out.println("D) 1781");
            
            answer = kbString.nextLine();
            if (answer.equalsIgnoreCase("B"))
            {
                System.out.println("Correct");
                numRight++;
            }
            else
            {
                System.out.println("Wrong!.");
            }
            //end of question
            
            System.out.println("Question 2 what is the 1st amendment.");
            
            System.out.println("A) right to bear arms.");
            System.out.println("B) quartering soldiers");
            System.out.println("C) right to freedom of press, religion, speech, petition the government and assembly");
            System.out.println("D) prohibits excessive bail, fines and cruel punishment");
            
            answer = kbString.nextLine();
            if (answer.equalsIgnoreCase("C"))
            {
                System.out.println("Correct");
                numRight++;
            }
            else
            {
                System.out.println("Wrong!.");
            }
            //end of question
            
            System.out.println("Question 3 what is the 2nd amendment.");
            
            System.out.println("A) right to bear arms");
            System.out.println("B) Prohibits unreasonable searches and seizures.");
            System.out.println("C) Rights not listed in other amendments are not necessarily involved.");
            System.out.println("D) Guarantees the right to jury trial in civil suits involving $20.00 or more.");
            
            answer = kbString.nextLine();
            if (answer.equalsIgnoreCase("A"))
            {
                System.out.println("Correct");
                numRight++;
            }
            else
            {
                System.out.println("Wrong!.");
            }
            //end of question
            
            System.out.println("Question 4 what is the 3rd amendment.");
            
            System.out.println("A) Right to drink water");
            System.out.println("B) Right to eat food.");
            System.out.println("C) Guarantees the right to bear arms.");
            System.out.println("D) Prohibits the quartering of soldiers in homes in peacetime.");
            
            answer = kbString.nextLine();
            if (answer.equalsIgnoreCase("D"))
            {
                System.out.println("Correct");

            }
            else
            {
                System.out.println("Wrong!.");
            }
            //end of question
            
            System.out.println("Question 5  what is the 4th amendment.");
            
            System.out.println("A) Guarantees the right to jury trial in civil suits involving $20.00 or more.");
            System.out.println("B) Prohibits unreasonable searches and seizures.");
            System.out.println("C) Requires grand jury indictment for a serious crime, bans double jeopardy, no loss of life, liberty or property without due process of law.");
            System.out.println("D) Guarantees the right to a speedy, impartial public trial in criminal cases with counsel and the right to cross examine.");
            
            answer = kbString.nextLine();
            if (answer.equalsIgnoreCase("B"))
            {
                System.out.println("Correct");
                numRight++;
            }
            else
            {
                System.out.println("Wrong!.");
            }
            //end of question
            
            System.out.println("Question 6  what is the 5th amendment.");
            
            System.out.println("A) Rights not listed in other amendments are not necessarily involved.");
            System.out.println("B) Guarantees the right to bear arms.");
            System.out.println("C) Requires grand jury indictment for a serious crime, bans double jeopardy, no loss of life, liberty or property without due process of law.");
            System.out.println("D) Guarantees the right to a speedy, impartial public trial in criminal cases with counsel and the right to cross examine.");
            
            answer = kbString.nextLine();
            if (answer.equalsIgnoreCase("C"))
            {
                System.out.println("Correct");
                numRight++;
            }
            else
            {
                System.out.println("Wrong!.");
            }
            //end of question
            
            System.out.println("Question 7  what is the 6th amendment.");
            
            System.out.println("A) Prohibits excessive bail or fines or cruel or unusual punishment");
            System.out.println("B) Prohibits unreasonable searches and seizures.");
            System.out.println("C) Rights not listed in other amendments are not necessarily involved.");
            System.out.println("D Guarantees the right to a speedy, impartial public trial in criminal cases with counsel and the right to cross examine.");
            
            answer = kbString.nextLine();
            if (answer.equalsIgnoreCase("D"))
            {
                System.out.println("Correct");

            }
            else
            {
                System.out.println("Wrong!.");
            }
            //end of question
            
            System.out.println("Question 8  what is the 7th amendment.");
            
            System.out.println("A) Guarantees the right to jury trial in civil suits involving $20.00 or more.");
            System.out.println("B) Prohibits excessive bail or fines or cruel or unusual punishment");
            System.out.println("C) Guarantees the right to bear arms.");
            System.out.println("B) Guarantees the right to a speedy, impartial public trial in criminal cases with counsel and the right to cross examine.");
            
            answer = kbString.nextLine();
            if (answer.equalsIgnoreCase("B"))
            {
                System.out.println("Correct");
                numRight++;
            }
            else
            {
                System.out.println("Wrong!.");
            }
            //end of question
            
            System.out.println("Question 9  what is the 8th amendment.");
            
            System.out.println("A) Prohibits excessive bail or fines or cruel or unusual punishment");
            System.out.println("B) Rights not listed in other amendments are not necessarily involved.");
            System.out.println("C) Guarantees the right to jury trial in civil suits involving $20.00 or more.");
            System.out.println("B) Prohibits unreasonable searches and seizures.");
            
            answer = kbString.nextLine();
            if (answer.equalsIgnoreCase("A"))
            {
                System.out.println("Correct");
                numRight++;
            }
            else
            {
                System.out.println("Wrong!.");
            }
            //end of question
            
            System.out.println("Question 10  what is the 9th amendment.");
            
            System.out.println("A) Rights not listed in other amendments are not necessarily involved.");
            System.out.println("B) Guarantees the right to jury trial in civil suits involving $20.00 or more.");
            System.out.println("C) Asserts that powers not delegated to the national government or denied to the states are reserved to the states.");
            System.out.println("B) Guarantees the freedom of religion, speech, press, assembly and the right to petition government.");
            
            answer = kbString.nextLine();
            if (answer.equalsIgnoreCase("A"))
            {
                System.out.println("Correct");
                numRight++;
            }
            else
            {
                System.out.println("Wrong!.");
            }
            //end of question\
            if (numRight==10)
            {
                System.out.println("you got an A 10/10");
            }
            if (numRight==9)
            {
                System.out.println("you got an A- 9/10");
            }
            if (numRight==8)
            {
                System.out.println("you got an B+ 8/10");
            }
            if (numRight==7)
            {
                System.out.println("you got an B 7/10");
            }
            if (numRight==6)
            {
                System.out.println("you got an B- 6/10");
            }
            if (numRight==5)
            {
                System.out.println("you got an C+ 5/10");
            }
            if (numRight==4)
            {
                System.out.println("you got an C 4/10");
            }
            if (numRight==3)
            {
                System.out.println("you got an C- 3/10");
            }
            if (numRight==2)
            {
                System.out.println("you got an D 2/10");
            }
            if (numRight==1)
            {
                System.out.println("you got an F 1/10");
            }
            System.out.println("Would you like to do this program again?");
            answer=kbString.nextLine();
        }while (answer.equalsIgnoreCase("yes"));
    }
}
            
        