#include <iostream>
#include <vector>
using namespace std;
int main(void){
        vector<int> arr1 = {1, 2, 3, 4, 5};
        vector<int> arr2 = {3, 4, 5, 6, 7};
        int n = arr1.size();
        int m = arr2.size();
        vector<int> arr3;
        int flag = 0;
        arr3.push_back(arr1[0]);
        for(int i = 0; i < n-1; i++){
            flag = 0; // Represents that the current element is not
            for(int j = 0; j < arr3.size()-1; j++){
                if(arr1[i]==arr3[j]){
                    flag = 1;
                }
            }
            if(flag = 0){
                arr3.push_back(arr1[i]);
            }
        }


        for(int i = 0; i < m-1; i++){
            flag = 0; // Represents that the current element is not
            for(int j = 0; j < arr3.size()-1; j++){
                if(arr2[i]==arr3[j]){
                    flag = 1;
                }
            }
            if(flag = 0){
                arr3.push_back(arr2[i]);
            }
        }
        for(int i = 0; i < arr3.size()-1; i++){
            cout << arr3[i] << " ";
            cout << "hello" << endl;
        }
}