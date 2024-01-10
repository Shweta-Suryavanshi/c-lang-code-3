//display odd factors and even factors
import java.util.*;//package for scaanner object 

class Program143
{
     public static void EvenOddFctors(int iNo)
     {
            int fact=1;
            for(int i=1;i<=iNo;i++)
            {
                if(iNo%i==0)
                {
                    if(i%2==0)
                    {
                        System.out.println("Even factors :"+i);
                    }
                    else
                    {
                        System.out.println("odd factors :"+i);
                    }
                }
            }
            
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