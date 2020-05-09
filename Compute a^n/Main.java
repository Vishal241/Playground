#include <iostream>
using namespace std;
int power(int n1, int n2);
int main() {
    int base, a, result;
    cout<<"Enter the value of a";
    cin>>base;
    cout<<"\nEnter the value of n";
    cin>>a;
    result = power(base, a);
    cout<<"\nThe value of "<<base<<" power "<<a<<" is "<<result;
    return 0;
}

int power(int base, int a) {
    if (a != 0)
        return (base * power(base, a - 1));
    else
        return 1;
}