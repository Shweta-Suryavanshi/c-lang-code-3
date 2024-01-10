//to count number of 1 in the ans
import java.util.*;
class Program156
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int No=0;
        int digit=0;
        int iCnt=0;

        System.out.println("Enter number");
        No=sobj.nextInt();

         while(No!=0)
        {
            digit=No%2;
            No=No/2;
            if(digit==1)
            {
                iCnt++;
            }
        }
        System.out.println("Number of 1 bit are: "+iCnt);

    }
}