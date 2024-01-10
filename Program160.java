import java.util.*;
class Program160
{
    public static boolean CheckBit(int No)
    {
         int iMask=16448;
        int iResult=0;

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
        boolean bRet=false;

        
        System.out.println("Enter number");
        No=sobj.nextInt();

        bRet=CheckBit(No);

        if(bRet==true)
        {
            System.out.println("7th and 15th bits is ON");
        }
        else
        {
            System.out.println("bits is OFF");
        }

    }
}