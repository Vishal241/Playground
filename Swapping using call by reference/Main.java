// C++ code to swap using XOR 
#include <bits/stdc++.h> 
using namespace std; 

int main() 
{ 
	int a,b; 
  cin>>a>>b;
	// Code to swap 'x' (1010) and 'y' (0101) 
	cout << "Before swapping a= " << a << " and b=" << b<<"\n";
  a = a ^ b; // x now becomes 15 (1111) 
	b = a ^ b; // y becomes 10 (1010) 
	a = a ^ b; // x becomes 5 (0101) 
	cout << "After swapping a= " << a << " and b=" << b; 
	return 0; 
} 