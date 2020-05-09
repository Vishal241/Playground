#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string a,b;
  getline(cin,a);
  getline(cin,b);
  if(a==b)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}