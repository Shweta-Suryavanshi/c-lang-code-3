import java.util.*;//package for scaanner object 

class Arithmatic
{
    public int iValue1;
    public int iValue2;

    public Arithmatic(int A, int B)
    {
        this.iValue1=A;
        this.iValue2=B;//this poointer is used to access the characteristics
    }
    
    public int Addition()
     {
        int isum=0;
        isum=this.iValue1+this.iValue2;
        return isum;
     }
}
class Program139
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