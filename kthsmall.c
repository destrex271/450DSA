# include <stdio.h>
# include <stdlib.h>

void get_arr(int* arr, int n){
    for(int i = 0; i < n; i++){
        scanf("%d",(arr+i));
    }
}

void sort(int* arr, int n){
    for(int i = 0 ; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(arr[i] >= arr[j]){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
    }
}

int main(){
    printf("Enter the value of n\n");
    int n;
    scanf("%d",&n);
    int* arr = (int*)malloc(n*sizeof(int));
    get_arr(arr,n);
    sort(arr,n);
    int k;
    printf("Enter the value of k\n");
    scanf("%d",&k);
    printf("The kth smallest element is %d and the kth maximum element is %d",arr[k-1],arr[n-k]);
    return 0;
}