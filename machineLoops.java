import java.util.*;
/**
 * Jack Bennett
**/
public class machineLoops
{
     public static void main(String[] args)
     {
         for(int x=1; x<=500; x++)
         {
             System.out.print(x+" ");
            }
         System.out.println(" ");
         for(int x=100; x>=1; x--)
         {
             System.out.print(x+" ");
            }
         System.out.println(" ");
         for(int x=1; x<=10; x++)
         {
             for(int y=1; y<=5; y++)
             {
                 System.out.print(x*y+"\t");
                }
            }
         System.out.println(" ");
        }
    }
                          