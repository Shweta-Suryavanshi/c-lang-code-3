//accepting elements of array
import java.util.*;//package for scaanner object 

class Program148
{
     public static int Addition(int Brr[])
     {
        int iCnt=0;
        int isum=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
           isum=isum+Brr[iCnt];
        }
        return isum;
     }
     public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        int isize=0;

        System.out.println("Enter the number of elements ");
        isize=sobj.nextInt();

        int Arr[]=new int[isize];

        System.out.println("Enter the elements ");
        for (int iCnt=0; iCnt<isize;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }

        int iRet=Addition(Arr);

        System.out.println("Addition of elements is "+iRet);

        sobj.close();
    }
}