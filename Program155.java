//to convert into binary
import java.util.*;
class Program155
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int No=0;
        int digit=0;
        
        System.out.println("Enter number");
        No=sobj.nextInt();

        while(No!=0)
        {
            digit=No%2;
            No=No/2;
            System.out.print(digit);
        }
        //System.out.println("Number of 1 bit are: "+digit);


       

    }
}