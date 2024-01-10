//to turn 11th bit OFF
import java.util.*;
class Program168
{
    public static boolean CheckBit(int No,int iPos)
    {
        int iMask=0x00000001;
        int iResult=0;
        iMask=iMask<<(iPos-1);
        
        iResult=No & iMask;

        if(iResult==iMask)
        {
           return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);
        int No=0;
        int iRet=0;
        int iPos=0;
        boolean bRet=false;

        
        System.out.println("Enter number");
        No=sobj.nextInt();

        System.out.println("Enter number");
        iPos=sobj.nextInt();

        bRet=CheckBit(No,iPos);

        if(bRet==true)
        {
            System.out.println("Bit is ON at given position");
        }
        else
        {
            System.out.println("Bit is OFF at given position");
        }

       
    }
}
    