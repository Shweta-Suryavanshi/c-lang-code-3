//sum of odd factors and even factors
import java.util.*;//package for scaanner object 

class Program144
{
     public static void EvenOddFctors(int iNo)
     {
            int fact=1;
            int iCnt=0;
            int sumeven=0;
            int sumodd=0;

            for(iCnt=1;iCnt<=iNo;iCnt++)
            {
                if(iNo%iCnt==0)
                {
                    if(iCnt%2==0)
                    {
                        sumeven=sumeven+iCnt;
                    }
                    else
                    {
                        sumodd=sumodd+iCnt;
                    }
                }
            }
            System.out.println("sum of even factors :"+sumeven);
            System.out.println("sum of odd factors :"+sumodd);
            
     }
     public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

       int iValue=0;

       System.out.println("Enter number: ");
       iValue=sobj.nextInt();

       EvenOddFctors(iValue);

       sobj.close();
    }
}