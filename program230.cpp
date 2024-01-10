//program using generic programming
#include<iostream>
using namespace std;

double Addition (double No1, double No2)
{
    int Ans=0.0;
    Ans=No1+No2;
    return Ans;
}

int main()
{
    double Value1=10.5,Value2=11.5, Ret=0.0;

    Ret=Addition(Value1,Value2);

    cout<<"Addition is: "<<Ret<<"\n";

    return 0;
}