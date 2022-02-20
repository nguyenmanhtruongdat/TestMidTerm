#include <iostream>
#include <math.h>
#define MAX 100
using namespace std;
void InputArr(int arr[MAX][MAX], int numRow, int numCol)
{
    for (int i = 0; i < numRow; i++)
    {
        for (int j = 0; j < numCol; j++)
        {
            cin >> arr[i][j];
        }
    }
}
void PrintArray(int arr[MAX][MAX], int numRow, int numCol)
{
    for (int i = 0; i < numRow; i++)
    {
        for (int j = 0; j < numCol; j++)
        {
            cout << arr[i][j] << "\t";
        }
        cout << endl;
    }
}
bool isPrime(int num)
{
    bool flag;
    int i = 2;
    int count = 0;
    if (num == 0 || num == 1){
        return flag=false;
    }
    while (i <= sqrt(num))
    {
        if (num % i == 0)
        {
            count++;
        }
        i++;
    }
    if (count == 0 && num > 1)
    {
        return flag = true;
    }
    else
    {
        return flag = false;
    }
}
int checkPrime(int arr[MAX][MAX], int numRow, int numCol){
    int count=0;
    for (int i = 0; i < numRow; i++)
    {
        for (int j = 0; j <numCol; j++)
        {
            if (isPrime(arr[i][j]))
            {
                cout<<arr[i][j]<<"\t";
                count++;
            }
            
        }
        
    }
    return count;
    
}
int main()
{
    int numRow, numCol;
    cin>>numRow;
    cin>>numCol;
    int arr[MAX][MAX];
    InputArr(arr, numRow, numCol);
    PrintArray(arr, numRow, numCol);
    checkPrime(arr, numRow, numCol);
}