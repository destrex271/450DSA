# include <stdio.h>
# include <stdlib.h>

void get_arr(int* arr, int n){
    for(int i = 0; i < n; i++){
        scanf("%d",(arr+i));
    }
}

int get_max(int* arr, int n){
    int max = arr[0];
    for(int i = 0; i < n; i++){
        max = (max < arr[i]) ? arr[i] : max;
    }
    return max;
}

int main(){
    int n;
    printf("Enter the number of elements in the array\n");
    scanf("%d",&n);
    int* arr = (int*)malloc(n*sizeof(int));
    get_arr(arr,n);
    printf("Max is %d\n",get_max(arr,n));
}