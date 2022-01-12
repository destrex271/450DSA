# include <iostream>

using namespace std;

int main(){
    int n;
    cout << "Enter the number of elements in the array " << endl;
    cin >> n;
    int *arr = new int[n];
    cout << "Enter the array elements" << endl;
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    int pt = 0;
    cout << "-------------------------------------" << endl;
    for(int i = 0; i < n; i+=arr[i]){
        try{
            int x = arr[i];
            cout << i << endl;
            if(i != n-1){
                pt++;
            }
        }catch(std::out_of_range){
            cout << "-1" << endl;
            return 0;
        }
    }
    cout << pt << endl ;
    return 0;
}