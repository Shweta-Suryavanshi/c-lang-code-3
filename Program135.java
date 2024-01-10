//addition of 2 numbers using buffered reader

import java.io.*;//package for buffered reader
class Program135
{
    public static void main(String arg[]) throws Exception//for checked exception
    {
        BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));

        int iNo1=0,iNo2=0;
        int Ans=0;

        System.out.println("Enter first number");
        iNo1=Integer.parseInt(bobj.readLine());

        System.out.println("Enter Second number");
        iNo2=Integer.parseInt(bobj.readLine());

        Ans=iNo1+iNo2;
        System.out.println("Addition is: "+Ans);

        bobj.close();
    }
}