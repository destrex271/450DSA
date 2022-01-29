# include <iostream>

using namespace std;

int getMax(int* arr, int len){
    int maxind = 0;
    for(int i = 1; i < len; i++){
        if(arr[i] > arr[maxind]){
            maxind = i;
        }
    }
    return maxind;
}

int main(){
    int n;
    cin >> n;
    int *arr = new int[n];
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    int *sumarr = new int[n];
    int k = 1;
    for(int i = 0; i < n; i++){
        int sum = 0; 
        for(int j = 0; j < k; j++){
            sum += arr[j];
        }
        sumarr[i] = sum;
        k++;
    }
    int idx = getMax(sumarr,n);
    cout << "Max Sum is " << sumarr[idx] << endl;
    cout << "The subarray is " << "(";
    for(int i = 0; i <= idx; i++){
        cout << sumarr[i] << " ";
    }
    cout << "\b)" << endl;
}