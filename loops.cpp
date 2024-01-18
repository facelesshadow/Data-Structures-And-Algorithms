# include <iostream>
using namespace std;

int main()
{
    //Prime or not
    int n;
    bool flag = true;
    cin >> n;
    for(int i = 2; i < n; i++)
    {
        if (n%i == 0)
        {
            flag = false;
        }
    }
    if (flag)
    {
        cout<< "Number is prime" << endl;
    }
    else
    {
        cout << "Number is not prime" << endl;
    }
    
}