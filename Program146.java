//accepting elements of array
import java.util.*;//package for scaanner object 

class Program146
{
     
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
        System.out.println("Elements of array are ");
        for(int iCnt=0; iCnt<isize;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

       sobj.close();
    }
}