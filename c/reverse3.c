# include <stdio.h>
# include <stdlib.h>
void get_arr(int* arr, int n){
    for(int i = 0; i  < n; i++){
        scanf("%d",(arr+i));
    }
}

void display_arr(int* arr, int n){
    for(int i = 0; i < n; i++){
        printf("%d ",*(arr+i));
    }
}

int main(){
    int n;
    printf("Enter the number of elements you want in the array\n");
    scanf("%d",&n);
    int* arr = (int*)malloc(n*sizeof(int));
    get_arr(arr,n);
    for(int i = 0, j = n-1; i <= n/2 ; i++, j--){
        int t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }
    display_arr(arr,n);
}