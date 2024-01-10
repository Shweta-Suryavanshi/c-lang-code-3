import Marvellous.Arithmatic;
import java.util.*;
class Program140
{
     
     public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        int iNo1=0,iNo2=0;
        int Ans=0;

        System.out.println("Enter first number");
        iNo1=sobj.nextInt();

        System.out.println("Enter Second number");
        iNo2=sobj.nextInt();

        Arithmatic aobj=new Arithmatic(iNo1,iNo2);

        Ans=aobj.Addition();
        System.out.println("Addition is: "+Ans);
    }
}