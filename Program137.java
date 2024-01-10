import java.util.*;//package for scaanner object
class Program137
{
     public static int Addition(int iValue1, int iValue2)
     {
        int isum=0;
        isum=iValue1+iValue2;
        return isum;
     }
     public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iNo1=0,iNo2=0;
        int Ans=0;

        System.out.println("Enter first number");
        iNo1=sobj.nextInt();

        System.out.println("Enter Second number");
        iNo2=sobj.nextInt();

        Ans=Addition(iNo1,iNo2);
        System.out.println("Addition is: "+Ans);
    }
}