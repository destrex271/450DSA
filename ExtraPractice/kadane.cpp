#include <iostream>

using namespace std;

long long maxSubarraySum(int arr[], int n){
    long long maxSum = arr[0];
    int temp = maxSum;
    for(int i = 1; i < n; i++){
        temp += i;
        maxSum = (temp > maxSum) ? temp : maxSum;
    }
    return maxSum;
}

void feedArray(int* arr){
    int len = sizeof(arr)/sizeof(arr[0]);
    for(int i = 0; i < len; i++){
        cin >> arr[i];
    }
}

void displayArray(int* arr, int n){
    for(int i = 0; i < n; i++){
        cout << arr[i] << endl;
    }
}

int main(){
    int n;
    cin >> n;
    int* arr = new int[n];
    feedArray(arr);
    displayArray(arr, n);
    return 0;
}