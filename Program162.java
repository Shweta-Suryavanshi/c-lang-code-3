//to check whether the 10th and 12th bit is ON or OFF
import java.util.*;
class Program162
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);
        int No=0;
        int iMask=0x00000a00;
        int iResult=0;
        
        System.out.println("Enter number");
        No=sobj.nextInt();

        iResult=No & iMask;

        if(iResult==iMask)
        {
            System.out.println("10th and 12th bit is ON");
        }
        else
        {
            System.out.println("10th and 12th bit is OFF");
        }

    }
}