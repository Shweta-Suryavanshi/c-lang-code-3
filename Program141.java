////calculate factorial using for loop
import java.util.*;//package for scaanner object 

class Program141
{
     public static int factorial(int iNo)
     {
            int fact=1;
            for(int i=1;i<=iNo;i++)
            {
                fact*=i;//fact=fact*i;
            }
            return fact;
     }
     public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

       int iValue=0,Ans=0;

       System.out.println("Enter number: ");
       iValue=sobj.nextInt();

       Ans=factorial(iValue);

       System.out.println("Factorial is : "+Ans);
       sobj.close();
    }
}