#include <iostream>
#include <bits/stdc++.h>
#include <vector>

using namespace std;

void display(vector<int> *vect){
    vector<int> :: iterator i;
    cout << "[ ";
    for(i = vect->begin(); i != vect->end(); i++){
        cout << *i << " ";
    }
    cout << " ]" << endl;
}

int main(){
    vector<int> arr;
    for(int i = 0; i < 10; i++){
        arr.push_back(i);
    }
    reverse(arr.begin(), arr.end());
    display(&arr);
    return 0;
}