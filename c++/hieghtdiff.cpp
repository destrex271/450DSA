# include <iostream>

using namespace std;

void sort(int* x, int len){
    for(int i = 0 ;i  < len-1; i++){
        for(int j = i+1; j < len; j++){
            if(x[i] > x[j]){
                int t = x[i];
                x[i] = x[j];
                x[j] = t;
            }
        }
    }
}

int main(){
    int n = 0;
    cout << "Enter the length of the array" << endl;
    cin >> n;
    int *arr = new int[n];
    int k;
    cout << "Enter the value of k" << endl;
    cin >> k;
    cout << "Enter array elements" << endl;
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    for(int i = 0; i < n; i++){
        arr[i] = (arr[i] - k < 0) ? arr[i] + k : arr[i] - k;
    }
    sort(arr, n);
    for(int i = 0; i < n; i++){
        cout << arr[i] << "  ";
    }
    cout << "The difference between the max and the lowest heights are " << arr[n-1] - arr[0] << " " << endl;
    return 0;
}