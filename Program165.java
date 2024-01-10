//to toggle the 7th bit
import java.util.*;
class Program165
{
    public static int ToggleBit(int No)
    {
        int iMask=0x00000040;
        int iResult=0;

        iResult=No ^ iMask;

        return iResult;
        
    }
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);
        int No=0;
        int iRet=0;

        
        System.out.println("Enter number");
        No=sobj.nextInt();

        iRet=ToggleBit(No);

        System.out.println("Updated number is "+iRet);
    }
}