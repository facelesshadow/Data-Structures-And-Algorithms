#include <iostream>
using namespace std;

void func(int i, int n){
    if (i<=0){
        return;
    }
    cout << i << endl;
    func(i-1, n);
}

int main(void){
    int N = 5;
    func(N,N);
    return 0;
}

