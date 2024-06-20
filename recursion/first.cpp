#include <iostream>
using namespace std;

void recurse(int n){
    if(n<=0){
        return;
    }
    recurse(n-1);
    cout << n << endl;

}

int main(void){
    int n = 5;
    recurse(5);
}

