import java.util.*;//package for scaanner object 

class Program153
{
    public static void Display(String str)
    {
        int iCnt=0;
        char Arr[]=str.toCharArray();
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        String str=null;

        System.out.println("Enter your name");
        str=sobj.nextLine();

        char Arr[]=str.toCharArray();
        int iCnt=0;

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        sobj.close();

    }
}