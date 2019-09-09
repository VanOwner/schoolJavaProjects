//the large blocks in comments are alternate ways of using this code
import java.util.*;
public class upsProject
{ 
    /*private static double calculateCost(double billableWeight,String shippingZone){
        double cost;
        try{
            int iZone = Integer.parseInt(shippingZone);
            if(iZone<1 || iZone>5){
                System.out.println("Invalid shipping zone "+shippingZone);
                return(4);
            } else {
                cost = (billableWeight*.08)+4+(iZone*.80);
            }
        } catch (NumberFormatException e){
            System.out.println(shippingZone+" is not a valid shipping zone:"+e);
            return(3);
        }
        return cost;
    }*/
    public static int main (String[] args)
    { 
        Scanner Scanner = new Scanner(System.in);
        Scanner Scanner2 = new Scanner(System.in);
        String zone;
        double weight=0;
        double length=0;
        double width=0;
        double height=0;
        double girth= 2 * width + 2 * height;
        double cSize;//cubic size
        double dWeight=0;//Dimensional Weight
        double cost = 0;
        double bWeight=0;//Billable Weight
        double sCharge = 0;

        //**********1&2
        System.out.println("This program does calculaty stuff");
        System.out.println("please enter the weight of your package?");
        weight=Scanner.nextDouble();
        weight=Math.round(weight);
        System.out.println("Your weight is "+weight);
        if(weight>150)
        {
            System.out.println("The package is to big");
            return(1);
        }

        //**********3
        System.out.println("please enter the length of your package?");
        length=Scanner.nextDouble();
        length=Math.round(length);
        System.out.println("please enter the length of your package is "+length);

        System.out.println("What is the width of your package?");
        width=Scanner.nextDouble();
        width=Math.round(width);
        System.out.println("The width of your package is "+width);

        System.out.println("please enter the height of your package?");
        height=Scanner.nextDouble();
        height=Math.round(height);
        System.out.println("The height of your package is "+height);

        girth=(2*width)+(2*height);
        System.out.println("The girth of your package is "+girth);
        if((length+girth)>165)
        {
            System.out.println("The girth of your package is too big.");
            return(2);
        }

        //*****************4
        cSize=length*width*height;
        System.out.println("The Cubic Size of your package is "+cSize);

        //**********5
        if(cSize>=5184)
        {
            dWeight=cSize/194;
        }
        else
        {
            dWeight=weight;
        }
        dWeight=Math.ceil(dWeight);
        System.out.println("The Dimensional weight of your package is "+dWeight);

        //**********6&7
        if(weight>dWeight)
        {
            bWeight=weight;
        }
        else
        {
            bWeight=dWeight;
        }
        System.out.println("The billable weight is "+bWeight);

        //**********8
        System.out.println("Please enter the zones you are going to ship to.");
        System.out.println("1: All states bordering of Minnesota.");
        System.out.println("2: The next two states away.");
        System.out.println("3: The next two states away from Zone 2.");
        System.out.println("4: All other states in the Continental US.");
        System.out.println("5: Alaska and hawaii.");

        zone=Scanner2.nextLine();
        //cost = calculateCost(bWeight,zone);   // encapsulation of cost logic to a separate method
        try{
            int iZone = Integer.parseInt(zone);
            if(iZone<1 || iZone>5){
                System.out.println("Invalid shipping zone "+iZone);
                return(4);
            } else {
                cost = (bWeight*.08)+4+(iZone*.80);
            }
        } catch (NumberFormatException e){
            System.out.println(zone+" is not a valid shipping zone:"+e);
            return(3);
        }
        System.out.println("This is your zone: "+zone);

        /*switch(zone.charAt(0)){
            case '1':
            cost=(bWeight*.08)+4+(1*.80);
            break;
            case '2':
            cost=(bWeight*.08)+4+(2*.80);
            break;
            case '3':
            cost=(bWeight*.08)+4+(3*.80);
            break;
            case '4':
            cost=(bWeight*.08)+4+(4*.80);
            break;
            case '5':
            cost=(bWeight*.08)+4+(5*.80);
            break;
            default:
            System.out.println(zone+" is not a valid shipping zone");
        }*/
        if(length+girth>130) //Large package surcharge
        {
            cost+=7.2;
        }
        if(bWeight>90) // heavy package surcharge
        {
            cost+=Math.round((bWeight-90)/5)*5;            
        }
       
        cost=Math.round(cost*100)/100.0d;
        System.out.println("Your Cost is $"+cost+" ");
        return(0);
    }
}

