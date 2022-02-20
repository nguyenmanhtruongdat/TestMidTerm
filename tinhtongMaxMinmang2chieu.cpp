#include<iostream>
#define MAX 50
using namespace std;

int sumRow(int arr[MAX][MAX], int numCol, int numRow)
{
    int row, sum = 0;
    
    cout<<"\nEnter row to calculate sum: ";
    cin>> row;
    if (row>0 && row<numRow)
    {
        
    for (int i = 0; i < numCol; i++)
    {
        sum = sum + arr[row][i];
    }
    

    cout<<"Sum of row "<<row<<" = "<<sum<<endl;
    }else{
        cout<<"Invalid index";
    }
    

    return sum;
}

int sumCol(int arr[MAX][MAX], int numRow, int numCol)
{
    int col, sum=0;

    cout<<"\nEnter column to calculate sum: ";
    cin>>col;
    if (col>0 && col<numCol)
    {
    for (int j = 0; j < numRow; j++)
    {
        sum = sum + arr[j][col];
    
    }
    
    cout<<"Sum of row "<<col<<" = "<<sum<<endl;
       
    }else{
        cout<<"Invalid index";
    }
    
   
    return sum;
}

void findRow(int arr[MAX][MAX], int &row, int &m, int &n, int numCol, int numRow)
{
    cout<<"\nEnter row to find max, min value: ";
    cin>>row;
    int max=arr[0][0];
    int min=arr[numRow-1][numCol-1];
    if (row>0 && row<numRow){

    for (int i = 0; i < numCol; i++)
    {
        if (arr[row][i]>max)
        {
            max=arr[row][i];
            m=max;
        }
        
    }

    for (int i = 0; i <numCol; i++)
    {
        if (arr[row][i]<min)
        {
            min=arr[row][i];
            n=min;
        }
        
    }
    }else{
        cout<<"Invalid index";
    }
    
}

void findCol(int arr[MAX][MAX], int &col, int &m, int &n, int numRow,int numCol)
{
    cout<<"Enter column to find max, min value: ";
    cin>>col;
    int max=arr[0][0];
    int min=arr[numRow-1][numCol-1];
     if (col>0 && col<numCol){
           for (int j = 0; j < numRow; j++)
    {
        if (arr[j][col]>max)
        {
            max=arr[j][col];
            m=max;
        }
        
    }

    for (int j = 0; j <numRow; j++)
    {
        if (arr[j][col]<min)
        {
            min=arr[j][col];
            n=min;
        }
        
    }
     }else{
         cout<<"Invalid index";
     }
  
}

int main()
{   
    int a, b, c, d, e, f;
    int num[MAX][MAX];
    int numRow, numCol;
    cin>>numRow;
    cin>>numCol;
    for(int i=0;i<numRow;i++)
      {
        for(int j=0;j<numCol;j++)
        {
            cout<<"\nnum["<<i<<"]["<<j<<"]=  ";
            cin>>num[i][j];
        }
      }

    for (int i = 0; i < numRow; i++)
	{
		for (int j = 0; j < numCol; j++)
		{
			cout << num[i][j] << "\t";
		}
		cout << endl;
	}

    sumRow(num, numCol, numRow);
    sumCol(num, numRow, numCol);
   
    findRow(num, a, b, c, numCol,numRow);
    cout<<"Max value of row "<<a<<" = "<<b;
    cout<<"\nMin value of row "<<a<<" = "<<c;
    cout<<endl<<endl;

    findCol(num, d, e, f, numRow, numCol);
    cout<<"Max value of column "<<d<<" = "<<e;
    cout<<"\nMin value of column "<<d<<" = "<<f;
    return 0;

}




		