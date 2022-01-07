# include <stdio.h>
# include <stdlib.h>

void shift_right(int* arr, int n){
    int* a1 = (int*)malloc(n*sizeof(int));
    int j = 0;
    for(int i = 0; i < n; i++){
        if(arr[i] >= 0){
            a1[j] = arr[i];
            j++;
        }
    }
    for(int i = 0; i < n ; i++){
        if(arr[i] < 0){
            a1[j] = arr[i];
            j++;
        }
    }
    for(int i = 0; i < n; i++){
        arr[i] = a1[i];
    }
}

void shift_left(int* arr, int n){
    int* a1 = (int*)malloc(n*sizeof(int));
    int j = 0;
    for(int i = 0; i < n; i++){
        if(arr[i] < 0){
            a1[j] = arr[i];
            j++;
        }
    }
    for(int i = 0; i < n ; i++){
        if(arr[i] >= 0){
            a1[j] = arr[i];
            j++;
        }
    }
    for(int i = 0; i < n; i++){
        arr[i] = a1[i];
    }
}

int main(){
    int n;
    printf("Enter the value of n\n");
    scanf("%d",&n);
    int* arr = (int*)malloc(n*sizeof(int));
    for(int i = 0; i < n; i++){
        scanf("%d",(arr+i));
    }
    shift_left(arr,n);
    for(int i = 0; i < n; i++){
        printf("%d ",arr[i]);
    }
    shift_right(arr,n);
    for(int i = 0; i < n; i++){
        printf("%d ",arr[i]);
    }
    return 0;
}