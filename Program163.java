//to turn 4th bit OFF
import java.util.*;
class Program163
{
    public static int OffBit(int No)
    {
        int iMask=0x00000008;
        int iResult=0;

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

        
        System.out.println("Enter number");
        No=sobj.nextInt();

        iRet=OffBit(No);

        System.out.println("Updated number is "+iRet);
    }
}