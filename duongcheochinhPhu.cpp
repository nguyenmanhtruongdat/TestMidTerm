#include <iostream>
#define MAX 50
using namespace std;
int SumDcc(int arr[MAX][MAX], int size)
{
    int sum = 0;
    for (int i = 0; i < size; i++)
    {
        sum += arr[i][i];
    }
    return sum;
}
int SumDcp(int arr[MAX][MAX], int size)
{
    int sum = 0;
    for (int i = 0; i < size; i++)
    {
        sum = sum + arr[i][size - 1 - i];
    }
    return sum;
}
int FindMaxDcc(int arr[MAX][MAX], int size)
{
    int max = arr[0][0];

    for (int i = 1; i < size; i++)
    {
        if (arr[i][i] > max)
        {
            max = arr[i][i];
        }
    }
    return max;
}
int FindMinDcc(int arr[MAX][MAX], int size)
{
    int min = arr[0][0];

    for (int i = 1; i < size; i++)
    {
        if (arr[i][i] < min)
        {
            min = arr[i][i];
        }
    }
    return min;
}
int FindmaxDcp(int arr[MAX][MAX], int size)
{
    int max = arr[0][size-1];
    for (int i = 0; i < size; i++)
    {
        if (arr[i][size - 1 - i] > max)
        {
            max = arr[i][size - 1 - i];
        }
    }
    return max;
}
int findMinDcp(int arr[MAX][MAX], int size)
{
    int min = arr[0][size-1];
    for (int i = 0; i < size; i++)
    {
        if (arr[i][size - 1 - i] < min)
        {
            min = arr[i][size - 1 - i];
        }
    }
    return min;
}
int calSumDcc(int arr[MAX][MAX], int size)
{
	int sum=0;
	for(int i=0;i<size;i++)
    {
		sum=sum+arr[i][i];
    }
	return sum;
}
int calSumDcp(int a[MAX][MAX], int size)
{
	int sum=0;
	for(int i=0;i<size;i++)
    {
		sum=sum+a[i][size-1-i];
    }
	return sum;
}
void printOdd(int arr[MAX][MAX], int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            if (arr[i][j]%2 != 0)
            {
                cout<<arr[i][j]<<" ";
            }
        }
        
    }  
}
void printEvent(int arr[MAX][MAX], int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            if (arr[i][j] %2 == 0)
            {
                cout<<arr[i][j]<<" ";
            }
        }
        
    }  
}
int main()
{
    int size;
    cin>>size;
    int arr[MAX][MAX];
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            cin >> arr[i][j];
        }
    }
    cout << endl;
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            cout << arr[i][j] << "\t";
        }
        cout << endl;
    }

    int sumDcc=calSumDcc(arr,size); cout<<"Sum dcc = "<<sumDcc<<endl;
    int sumDcp =calSumDcp(arr, size);cout<<"Sum dcp="<<sumDcp<<endl;
    int maxDcc = FindMaxDcc(arr, size);cout<<"MAX dcc="<<maxDcc<<endl;
    int minDcc = FindMinDcc(arr, size);cout<<"Min dcc="<<minDcc<<endl;
    int maxDcp = FindmaxDcp(arr, size);cout<<"MAX dcp="<<maxDcp<<endl;
    int minDcp = findMinDcp(arr, size);cout<<"Min dccp="<<minDcp<<endl;
    cout<<"Event";
    printEvent(arr, size);
    cout<<endl;
    cout<<"Odd";
    printOdd(arr, size);
}