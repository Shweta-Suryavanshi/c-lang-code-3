//calculate factorial using while loop
import java.util.*;//package for scaanner object 

class Program142
{
     public static int factorial(int iNo)
     {
            int fact=1;
            int i=1;
           while(i<= iNo)
            {
                fact*=i;//fact=fact*i;
                i++;
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