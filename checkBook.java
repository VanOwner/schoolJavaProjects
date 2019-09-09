import java.util.*;
import java.io.*;

public class checkBook
{
    private static int cNumb[]= new int[10];
    private static String desc[]= new String[10];
    private static double amount[]= new double[10];
    private static double bal[]= new double[10];

    private static void addTransaction(String desc, double amount, int cNumb){

    }

    private static void printTransactions(int[] numbers,String[] descriptions, double[] amounts, double[] balances){
        for(int x=0; x<numbers.length; x++){
            System.out.println("Check Number |     Description      |     Amount      |    Balance    |");
            System.out.println("=======================================================================");
            System.out.println(numbers[x]+"    "+descriptions[x]+"    "+amounts[x]+"    "+balances[x]);
        }   
    }

    private static void saveTransactions(int[] numbers,String[] descriptions, double[] amounts, double[] balances) throws IOException{ 
        FileWriter fw = new FileWriter("checks.out");
        PrintWriter output = new PrintWriter(fw);
        for(int x=0; x<numbers.length; x++){
            output.println(numbers[x]);
            output.println(descriptions[x]);
            output.println(amounts[x]);
            output.println(balances[x]);
        }   
        fw.close( );
    }

    private static void readTransactions() throws IOException {
        File f = new File("checks.out");
        if(f.exists() && f.canRead()){
            //open file
            //loop to end of file
            //read first line from file into cNumb, next into desc,next amount
            //calculate balance

            System.out.println("");
            System.out.println("Now reading from file...");
            FileReader file2 = new FileReader("checks.out");
            Scanner inFile2 = new Scanner(file2);

            for(int x=1; x<=2; x++)
            {
                cNumb[x]=Integer.parseInt(inFile2.nextLine());
                desc[x]=inFile2.nextLine();
                amount[x]=Double.parseDouble(inFile2.nextLine());
                bal[x]=Double.parseDouble(inFile2.nextLine());
            }
            inFile2.close( );
            file2.close( );
        }
    }

    public static void main(String[] args) throws IOException
    {
        readTransactions();
        int choice=0;       
        Scanner kb = new Scanner(System.in);
        while (choice != 4)
        {

            System.out.println(" ");
            System.out.println(" ");
            System.out.println("=============================================");
            System.out.println("|               MAIN MENU                   |");
            System.out.println("=============================================");
            System.out.println("|        Options:                           |");
            System.out.println("|        1. Add Transaction                 |");
            System.out.println("|        2. Save File                       |");
            System.out.println("|        3. Print Transactions              |");
            System.out.println("|        4. Quit without saving             |");
            System.out.println("=============================================");
            System.out.println(" ");
            choice=kb.nextInt();
            switch(choice){
                case 1:
                // code to add a transaction. This is where it gets a bit harder... you need to figure out how many transactions are already
                // in the arrays and add on to the end of the arrays...
                // what will happen if you get to 11 items? Your arrays are only 10 big at the moment.
                System.out.println("1. Deposit or 2. Spend?");
                choice=kb.nextInt();
                if(choice==1){
                    System.out.println("How much would you like to deposit?");
                    double amount=kb.nextDouble();

                    addTransaction("deposit", amount, 0);

                }
                if(choice==2){
                    System.out.println("How much did you spend?");
                    double amount=kb.nextDouble();
                    System.out.println("What did you spend it on?");
                    String desc=kb.nextLine();
                    System.out.println("What is the check number?");
                    int cNumb=kb.nextInt();
                    addTransaction(desc, amount, cNumb);
                }

                break;
                case 2:
                saveTransactions(cNumb, desc, amount, bal);   
                break;
                case 3:
                printTransactions(cNumb, desc, amount, bal);
                break;
            }

        }
        System.out.println("Thanks for using this program.");
        System.out.println("\f");
        System.exit(0);
    }
}