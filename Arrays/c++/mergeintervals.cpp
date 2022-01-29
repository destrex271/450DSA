# include <iostream>

using namespace std;

int main(){
    int n;
    cout << "Enter the number of intervals u want to add" << endl;
    cin >> n;
    int** ptr = new int*[n];
    int** fin = new int*[n];
    for(int i = 0; i < n; i++){
        ptr[n] = new int[2];
        fin[n] = new int[2]; 
    }
    for(int i = 0; i < n; i++){
        cin >> ptr[i][0];
        cin >> ptr[i][1];
    }
    for(int i = 0 ; i < n-1; i++){
        int a = ptr[i][0];
        int b = ptr[i][1];
        for(int j = i+1; j < n; j++){
            int c = ptr[j][0];
            int d = ptr[j][1];
            int sm = (a<c)?a:c;
            int up = (b>d)?b:d;
            fin[i][0] = sm;
            fin[i][1] = up;
        }
    }

    for(int i = 0; i < n; i++){
        cout << "[" << fin[i][0] << " : " << fin[i][1] << "]" << endl;
    }
}