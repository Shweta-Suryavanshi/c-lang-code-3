import java.util.*;//package for scaanner object 

class Program151
{
    public static void Display(String str)
    {
        for(int iCnt=0;iCnt<str.length();iCnt++)
        {
            System.out.println(str.charAt(iCnt));
        }

    }
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        String str=null;

        System.out.println("Enter your name");
        str=sobj.nextLine();

        Display(str);

        sobj.close();

    }
}
