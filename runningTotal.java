import java.util.*;
public class runningTotal
{
    public static void main(String [] args)
    {
        Scanner kbReader=new Scanner(System.in);
        int x=1;
        int runningTotal=0;
        do
        {
            System.out.println("Please Enter a number");
            int answer=kbReader.nextInt();
            runningTotal+=answer;
            x++;
        } while (x>10);
        System.out.println("your total is "+runningTotal);
    }
}
