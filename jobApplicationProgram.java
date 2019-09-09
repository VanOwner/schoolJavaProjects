import java.util.*;
public class jobApplicationProgram
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        String email;
        String fName;
        String lName;
        String mName;
        String hNumber; 
        String street;
        String city;
        String state;
        String zCode;
        int pNumber;
        int ssn;
        int bTime2Contact;
        String e2Work;
        String filedApp;
        String everBeenEmployed;
        String anyRelativesWork;
        String currentlyEmployed;
        String contactEmployer;
        System.out.println("Application for employment");
        System.out.println("Please enter your email");
        email=kb.nextLine();
        
        System.out.println("Please enter your first name");
        fName=kb.nextLine();
        
        System.out.println("Please enter your last name");
        lName=kb.nextLine();
        
        System.out.println("Please enter your middle name");
        mName=kb.nextLine();
        
        System.out.println("Now please enter your house number");
        hNumber=kb.nextLine();
        
        System.out.println("Please enter your Street");
        street=kb.nextLine();
        
        System.out.println("Please enter your city");
        city=kb.nextLine();
        
        System.out.println("Please enter your state");
        state=kb.nextLine();
        
        System.out.println("Please enter your zip code");
        zCode=kb.nextLine();
        
        System.out.println("Please enter your phone number ");
        pNumber=kb.nextInt();
        
        System.out.println("Please enter your Social Security number(Optional)");
        ssn=kb.nextInt();
        
        System.out.println("What is the best time to contact you");
        bTime2Contact=kb.nextInt();
        
        Scanner kb2 = new Scanner(System.in);
        System.out.println("If you are under the age of 18 can you provide proof of your eligibility to work Yes or No");
        e2Work=kb2.nextLine();
        
        System.out.println("Have your every filed an application with us before if yes than give date");
        filedApp=kb2.nextLine();
        
        System.out.println("Have you ever been employed with us before if yes than give date");
        anyRelativesWork=kb2.nextLine();
        
        System.out.println("Do you have any friends or relatives that work here if yes give State name relationship and location");
        currentlyEmployed=kb2.nextLine();
        
        System.out.println("Are your currently employed Yes or No");
        currentlyEmployed=kb2.nextLine();
        
        System.out.println("May we contact your present employer Yes or No");
        contactEmployer=kb2.nextLine();
        
        System.out.println("Email:"+email);
        System.out.println("First name:"+fName);
        System.out.println("Last name:"+lName);
        System.out.println("Middle name:"+mName);
        System.out.println("House number:"+hNumber);
        System.out.println("Steet:"+street);
        System.out.println("City"+city);
        System.out.println("Zip code"+zCode);
        System.out.println("Phone number"+pNumber);
        System.out.println("SSN:"+ssn);
        System.out.println("");
        System.out.println("Thank you for applying have a nice day");
       
    }
}
