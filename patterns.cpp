#include <iostream>
using namespace std;

int main(){
/*
int n;
cin>>n;
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            cout << "*";
        }
        cout << "" << endl;
    }
    

*/
/*
int n;
cin>>n;
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            cout << i;
        }
        cout << "" << endl;
    }
*/
/*
int count = 1;
int n;
cin>>n;
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            cout << count;
            count++;
        }
        cout << "" << endl;

    }*/

/*
int count;
int n;
cin>>n;
    for(int i = 1; i <= n; i++)
    {
        count = i;
        for(int j = 1; j <= i; j++)
        {
            cout << count;
            count--;
        }
        cout << "" << endl;

    }*/

/*
    char ch = 'A';
    int n = 4;
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            cout << ch;
            
        }
        cout << "" << endl;
        ch = ch+1;
    }
*/
/*
    char ch;
    int n = 4;
    for(int i = 0; i < n; i++)
    {
        ch = 'A';
        for(int j = 0; j < n; j++)
        {
            cout << ch;
            ch = ch+1;    
        }
        cout << "" << endl;
        
    }
*/
/*
    char ch = 'A';
    int n = 4;
    for(int i = 0; i < n; i++)
    {
        
        for(int j = 0; j < n; j++)
        {
            cout << ch;
            ch = ch+1;        
        }
        
        cout << "" << endl;
        
    }
*/
    char ch = 'c';
    int n = 3;
    for(int i = 0; i < n; i++)
    {
        ch = ch-2;
        for(int j = 0; j < n; j++)
        {
            cout << ch;
            ch = ch+1;        
        }
        
        cout << "" << endl;
        
    }

}