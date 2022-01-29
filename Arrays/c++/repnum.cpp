# include <iostream>

using namespace std;

int getFreq(int* arr, int len, int elem){
    int freq = 0;
    for(int i = 0; i < len; i++){
        if(arr[i] == elem){
            freq++;
        }
    }
    return freq;
}

int main(){
    int n;
    cout << "Enter the number of elements you want in this list\n";
    cin >> n;
    int* arr = new int[n];
    int elem;
    cout << "Enter the elements in your array\n" ;
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    for(int i = 0 ; i < n ; i ++){
        int elem = arr[i];
        if(getFreq(arr,n,elem) > 1){
            cout << elem << " is the repeating element." << endl;
            break;
        }
    }
    delete[] arr;
    return 0;
}