#include <iostream>
using namespace std;
int main()
{
    int i, j,row_size,column_size;
    int a[50][50],b[50][50],sum[50][50];
    cin>>row_size;
    cin>>column_size;
    /* Input data in matrix */
    for (i = 0; i < row_size; i++)
    {
        for (j = 0; j < column_size; j++)
        {
            cin>>a[i][j];
        }
    }


     for (i = 0; i < row_size; i++)
    {
        for (j = 0; j < column_size; j++)
        {
            cin>>b[i][j];
        }
    }
    
    for(i = 0; i <row_size; i++)
    {
        for(j = 0; j <column_size; j++)
        {
            sum[i][j] = a[i][j] + b[i][j];
        }
    }
    
    for (i = 0; i <row_size; i++)
    {
        for (j = 0; j <column_size; j++)
        {
            cout<<sum[i][j]<<" ";
        }
        cout<<"\n";
    }
    return 0;
}