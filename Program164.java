//to turn 11th bit OFF
import java.util.*;
class Program164
{
    public static int OffBit(int No)
    {
        int iMask=0x00000400;
        int iResult=0;

        iResult=No ^ iMask;

        if(iResult==iMask)
        {
           return iResult;
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