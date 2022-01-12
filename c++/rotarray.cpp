# include <iostream>

using namespace std;

void displayArr(int* arr, int len){
    for(int i = 0; i < len; i++){
        cout << arr[i] << "  ";
    }
}

int main(){
    int n = 0;
    cout << "Enter the size of the array" << endl;
    cin >> n ;
    int *arr = new int[n];
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    int x = arr[n-1];
    for(int i = n-2; i >= 0; i--){
        arr[i+1] = arr[i];
    }
    arr[0] = x;
    displayArr(arr,n);
    return 0;
}