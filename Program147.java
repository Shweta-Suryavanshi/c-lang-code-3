//accepting elements of array
import java.util.*;//package for scaanner object 

class Program147
{
     public static void Display(int Brr[])
     {
        int iCnt=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            System.out.print(Brr[iCnt]+" ");
        }
        System.out.println();

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

        Display(Arr);

        sobj.close();
    }
}