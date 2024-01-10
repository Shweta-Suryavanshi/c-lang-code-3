//to turn 11th bit OFF
import java.util.*;
class Program167
{
    public static int OffBit(int No,int iPos)
    {
        int iMask=0x00000001;
        int iResult=0;
        iMask=iMask<<(iPos-1);
        
        iResult=No & iMask;

        if(iResult==iMask)
        {
           return (No^iMask);
        }
        else
        {
            return No;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);
        int No=0;
        int iRet=0;
        int iPos=0;

        
        System.out.println("Enter number");
        No=sobj.nextInt();

        System.out.println("Enter number");
        iPos=sobj.nextInt();

        iRet=OffBit(No,iPos);

        System.out.println("Updated number is "+iRet);
    }
}
    