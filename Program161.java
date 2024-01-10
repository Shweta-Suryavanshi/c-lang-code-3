//to check whether the 3rd bit is ON or OFF
import java.util.*;
class Program161
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);
        int No=0;
        int iMask=0x00000004;
        int iResult=0;
        
        System.out.println("Enter number");
        No=sobj.nextInt();

        iResult=No & iMask;

        if(iResult==iMask)
        {
            System.out.println("4th bit is ON");
        }
        else
        {
            System.out.println("4th bit is OFF");
        }

    }
}