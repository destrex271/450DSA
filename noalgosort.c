# include <stdio.h>

int main(){
    int arr[3];
    printf("Enter the values");
    for(int i = 0 ; i < 3; i++){
        scanf("%d",(arr+i));
    }
    int max = 2;
    for(int i = 0 ; i < 3; i++){
        int dif = max - arr[i];
        int t = arr[2-dif];
        arr[2-dif] = arr[i];
        arr[i] = t;
    }
    for(int i = 0; i < 3; i++){
        printf("%d ",arr[i]);
    }
    return -1;
}