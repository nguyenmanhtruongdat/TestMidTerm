#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;

    int n2=n;
    int count=0;

    int max=0;

    if (n<=0 || n>=1000)
    {
        cout<<"N";
        exit(0);
    }else{

    
    
    while (n!=0)
    {
        int digit=n%10;
        if (digit>max)
        {
            max=digit;
        }
        n/=10;
        
    }

    while (n2!=0)
    {
        int temp=n2%10;
        if (temp==max)
        {
            count++;
        }
        n2/=10;
        
    }

    cout<<max<<" "<<count;
    
    }
    
    

    return 0;
}