//display 1  * 2 * 3 * 4 * 5 *
import java.util.*;//package for scaanner object 

class Program145
{
     public static void Display(int iNo)
     {
           int iCnt=0;
           for(iCnt=1;iCnt<=iNo;iCnt++)
           {
            System.out.print(iCnt+" "+"*"+" ");
           } 
     }
     public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

       int iValue=0;

       System.out.println("Enter number: ");
       iValue=sobj.nextInt();

       Display(iValue);

       sobj.close();
    }
}