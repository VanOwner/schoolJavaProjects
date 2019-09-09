import java.util.*;
import java.io.*;
public class AddressBook
{
    public static void main(String[] args) throws IOException
    {
        Scanner kbReader = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your Address Book!.");
        System.out.println("Please select an option.");
        String fName[]= new String[10];
        String lName[]= new String[10];
        String phone[]= new String[10];
        String street[]= new String[10];
        String city[]= new String[10];
        String state[]= new String[10];
        String zCode[]= new String[10];
        String email[]= new String[10];
        int choice=0;
        String answer;
        int Person=0;
        int People=0;
        int numbPeople=0;
        int choice2=0;
        int search=0;
        do
        {
            System.out.println("");
            System.out.println("|================================|");
            System.out.println("|         MAIN MENU              |");
            System.out.println("|================================|");
            System.out.println("|  1. Retrieve an Address Book   |");
            System.out.println("|  2. Start a new Address Book   |");
            System.out.println("|  3. Quit                       |");
            System.out.println("|================================|");
            choice=keyboard.nextInt();
            if(choice==1)
            {
                System.out.println("")
                     //names\/file for code         //names\/file in folder
                FileReader file1 = new FileReader("PersonFile.out");//creates file reader
                Scanner inFile = new Scanner(file1);//creates scanner
                Person=inFile.nextInt();
                inFile.close( );//closes file
                file1.close( );//closes file
                System.out.println("Now reading from file...");
                FileReader file2 = new FileReader("PersonFile2.out");//creates second file
                Scanner inFile2 = new Scanner(file2);//creates scannr
                for( int x=1; x<=People; x++)
                {
                    fName[x]=inFile2.nextLine();
                    lName[x]=inFile2.nextLine();
                    phone[x]=inFile2.nextLine();
                    street[x]=inFile2.nextLine();
                    city[x]=inFile2.nextLine();
                    state[x]=inFile2.nextLine();
                    zCode[x]=inFile2.nextLine();
                }
                inFile.close( );
                file2.close( );
                System.out.println("Here is your Address Book");
                for(int x=1; x<=People; x++)
                {
                    System.out.println(x+" "+fName[x]+" "+lName[x]+" "+phone[x]+" "+street[x]+" "+city[x]+" "+state[x]+" "+zCode[x]+"");
                }
            }
            if(choice==2)
            {
                System.out.println("Please enter the following information for your People type 'done' when you are finished");
                boolean keepGoing=true;
                do
                {
                    for (int x=1; x<=10; x++)
                    {
                        numbPeople++;                        
                        System.out.println("Please enter Person #"+x+" First Name");                        
                        fName[numbPeople]=kbReader.nextLine();
                        if(fName[numbPeople].equalsIgnoreCase("done"))
                        {
                            keepGoing=false;
                            numbPeople--;
                            System.out.println("You have "+numbPeople+" People in your address book");
                        }
                        else
                        {
                            System.out.println("Please enter contact #"+x+" Last name");
                            lName[numbPeople]=kbReader.nextLine();
                            System.out.println("Please enter contact #"+x+" phone number");
                            phone[numbPeople]=kbReader.nextLine();
                            System.out.println("Please enter contact #"+x+" street name");
                            street[numbPeople]=kbReader.nextLine();
                            System.out.println("Please enter contact #"+x+" city name");
                            city[numbPeople]=kbReader.nextLine();
                            System.out.println("Please enter contact #"+x+" state name");
                            state[numbPeople]=kbReader.nextLine();
                            System.out.println("Please enter contact #"+x+" Zip Code code");
                            zCode[numbPeople]=kbReader.nextLine();
                        }
                    }
                } while (keepGoing==true);
                System.out.println("Here is your information for your Persons");
                for(int x=1; x<=numbPeople; x++)
                {
                    System.out.println(x+" "+fName[x]+" "+lName[x]+" "+phone[x]+" "+street[x]+" "+city[x]+" "+state[x]+" "+zCode[x]+"");
                }
                FileWriter fw = new FileWriter("numbPeople.File.out");
                PrintWriter output = new PrintWriter(fw);
                output.println(numbPeople);
                output.close( );
                fw.close( );
                FileWriter fw2 = new FileWriter("Output2.out");
                PrintWriter output2 = new PrintWriter(fw2);
                System.out.println("Now writing to file...");
                for(int x=1; x<=numbPeople; x++)
                {
                    output2.println(fName[x]);
                    output2.println(lName[x]);
                    output2.println(phone[x]);
                    output2.println(street[x]);
                    output2.println(city[x]);
                    output2.println(state[x]);
                    output2.println(zCode[x]);
                }
                output2.close( );
                fw2.close( );
            }
            if(choice==3)
            {
                System.out.println("Thank you for using this program.");
            }
            else
            {
                do
                {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("|==============================================|");
                    System.out.println("|                    SUB MENU                  |");
                    System.out.println("|==============================================|");
                    System.out.println("|     1. Print your AddressBook on screen      |");
                    System.out.println("|     2. Edit a person                         |");
                    System.out.println("|     3. Add a person                          |");
                    System.out.println("|     4. Delete a person                       |");
                    System.out.println("|     5. Search for a person                   |");
                    System.out.println("|     6. Quit                                  |");
                    System.out.println("|==============================================|");
                    choice2=kbReader.nextInt();
                    if(choice2==1)
                    {
                        System.out.println("Here's your AddressBook:");

                        for(int x=1; x<=numbPeople; x++)
                        {
                            System.out.println(x+" "+fName[x]+" "+lName[x]+" "+phone[x]+" "+street[x]+" "+city[x]+" "+state[x]+" "+zCode[x]+"");
                            if (x%20==0)
                            {
                                System.out.println("Hit the return key to continue adding People.");
                                kbReader.next();
                            }
                        }
                    }
                    if(choice2==2)
                    {
                        System.out.println("\f Edit a Person");
                        for(int x=1; x<=numbPeople; x++)
                        {
                            System.out.println(x+" "+fName[x]+" "+lName[x]+" "+phone[x]+" "+street[x]+" "+city[x]+" "+state[x]+" "+zCode[x]+"");
                            if(x%20==0)
                            {
                                System.out.println("Hit the Return key to continue adding People.");
                                kbReader.next();
                            }
                        }
                        Scanner kb2 = new Scanner(System.in);
                        System.out.println("What Person are you looking for?");
                        int PersonNum=kbReader.nextInt();
                        System.out.println("Please enter your Persons #"+PersonNum+" First name");
                        fName[PersonNum]=kb2.nextLine();
                        System.out.println("Please enter your Persons #"+PersonNum+" Last  name");
                        lName[PersonNum]=kb2.nextLine();
                        System.out.println("Please enter your Persons #"+PersonNum+" phone number");
                        phone[PersonNum]=kb2.nextLine();
                        System.out.println("Please enter your Persons #"+PersonNum+" Street name");
                        street[PersonNum]=kb2.nextLine();
                        System.out.println("Please enter your Persons #"+PersonNum+" city name");
                        city[PersonNum]=kb2.nextLine();
                        System.out.println("Please enter your Persons #"+PersonNum+" state name");
                        state[PersonNum]=kb2.nextLine();
                        System.out.println("Please enter your Persons #"+PersonNum+" Zip Code code");
                        zCode[PersonNum]=kb2.nextLine();
                    }
                    if(choice2==3)
                    {
                        Scanner kb3 = new Scanner(System.in);
                        System.out.println("\f Add a Person");
                        numbPeople++;
                        System.out.println("Please enter the First Name name of the Person you wish to add");
                        fName[numbPeople]=kb3.nextLine();
                        System.out.println("Please enter the Last Name name of the Person you wish to add");
                        lName[numbPeople]=kb3.nextLine();
                        System.out.println("Please enter the phone number of the Person you wish to add");
                        phone[numbPeople]=kb3.nextLine();
                        System.out.println("Please enter the street name of the Person you wish to add");
                        street[numbPeople]=kb3.nextLine();
                        System.out.println("Please enter the city name of the Person you wish to add");
                        city[numbPeople]=kb3.nextLine();
                        System.out.println("Please enter the state name of the Person you wish to add");
                        state[numbPeople]=kb3.nextLine();
                        System.out.println("Please enter the Zip Code code of the Person you wish to add");
                        zCode[numbPeople]=kb3.nextLine();
                    }
                    if(choice2==4)
                    {
                        System.out.println("\f Delete a person");
                        for(int x=1; x<=numbPeople; x++)
                        {
                            System.out.println(x+" "+fName[x]+" "+lName[x]+" "+phone[x]+" "+street[x]+" "+city[x]+" "+state[x]+" "+zCode[x]+"");
                            if(x%20==0)
                            {
                                System.out.println("Hit the return key to continue.");
                                kbReader.next();
                            }
                        }
                        System.out.println("What is the Person you want to Delete from your AddressBook?");
                        int PersonNum=kbReader.nextInt();
                        for(int x=PersonNum; x<PersonNum; x++)
                        {
                            fName[x]=fName[x+1];
                            lName[x]=lName[x+1];
                            phone[x]=phone[x+1];
                            street[x]=street[x+1];
                            city[x]=city[x+1];
                            state[x]=state[x+1];
                            zCode[x]=zCode[x+1];
                        }
                        numbPeople--;
                    }
                    if(choice2==5)
                    {
                        Scanner kb4 = new Scanner(System.in);
                        System.out.println("\f What is the First Name name of the person you are looking for?");
                        String searchfName=kb4.nextLine();
                        System.out.println("\f What is the Last Name name of the person you are looking for?");
                        String searchlName=kb4.nextLine();
                        System.out.println("\f What is the phone number of the person you are looking for?");
                        String searchphone=kb4.nextLine();
                        System.out.println("\f What is the street name of the person you are looking for?");
                        String searchstreet=kb4.nextLine();
                        System.out.println("\f What is the city name of the person you are looking for?");
                        String searchcity=kb4.nextLine();
                        System.out.println("\f What is the state name of the person you are looking for?");
                        String searchstate=kb4.nextLine();
                        System.out.println("\f What is the Zip Code code of the person you are looking for?");
                        String searchzCode=kb4.nextLine();
                        boolean found = false;
                        for(int x=1; x<=numbPeople; x++)
                        {
                            if(searchfName.equalsIgnoreCase(fName[x]))
                            {
                                System.out.println("This one? "+fName[x]+" "+lName[x]+" "+phone[x]+" "+street[x]+" "+city[x]+" "+state[x]+" "+zCode[x]+"");
                                answer=kbReader.nextLine();
                                if(answer.equalsIgnoreCase("yes"))
                                {
                                    found = true;
                                    break;
                                }
                            }
                        }
                        if (!found)
                        {
                            System.out.println("Sorry, the person you are looking for was not found.");
                        }
                    }
                    if(choice2==6)
                    {
                        Scanner kb5= new Scanner(System.in);
                        String answer2;
                        System.out.println("Do you wish to save your work? Yes or No");
                        answer2=kb5.nextLine();
                        if(answer2.equalsIgnoreCase("Yes"))
                        {
                            FileWriter fw = new FileWriter("numbPersonFile.out");
                            PrintWriter output = new PrintWriter(fw);
                            output.println(numbPeople);
                            output.close( );
                            fw.close( );
                            FileWriter fw2 = new FileWriter("Output2.out");
                            PrintWriter output2 = new PrintWriter(fw2);
                            System.out.println("Now writing to file...");
                            for(int x=1; x<=numbPeople; x++)
                            {
                                fName[x]=fName[x+1];
                                lName[x]=lName[x+1];
                                phone[x]=phone[x+1];
                                street[x]=street[x+1];
                                city[x]=city[x+1];
                                state[x]=state[x+1];
                                zCode[x]=zCode[x+1];
                            }
                            output2.close( );
                            fw2.close( );
                            System.out.println("Done!");
                        }
                        System.out.println("");
                        System.out.println("Have a nice day!");
                        choice=3;
                    }
                    if(answer2.equalsIgnoreCase("No"))
                    {
                         System.exit(0);
                    }
                }while (choice2!=6);
            }
        } while (choice!=3);
    }
}


