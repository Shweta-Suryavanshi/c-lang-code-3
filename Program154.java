import java.util.*;//package for scaanner object 

class Program154
{
    public static int countcapital(String str)
    {
        int iCnt=0;
        int icount=0;

        char Arr[]=str.toCharArray();
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt]>='A')&&(Arr[iCnt]<='Z'))
            {
                icount++;
            }
        }
        return icount;
    }
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        String str=null;

        System.out.println("Enter your name");
        str=sobj.nextLine();

        int iRet=countcapital(str);

        System.out.println("Number of capital character are "+iRet);

    

        sobj.close();

    }
}