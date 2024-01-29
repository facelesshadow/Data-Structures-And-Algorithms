#include <iostream>
using namespace std;

int main(){
    int n;
    cout<< "Enter the number: ";
    cin>>n;
    bool isPrime = true;
    for(int i = 2; i < n; i++)
    {
        if (n%i == 0)
        {
            isPrime = false;
            break;
        }
    }
    if(isPrime == false)
    {
        cout<< "Number is not prime" << endl;
    }
    else
    {
        cout<<"Is Prime"<< endl;
    }

}