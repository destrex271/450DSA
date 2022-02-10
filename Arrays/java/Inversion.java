import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Inversion{

    public static int count(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[])throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int[] arr;
        int n;
        n = Integer.parseInt(bfr.readLine());
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(bfr.readLine());
        }
        int invCount = count(arr);
        System.out.printf("Inversion Count is %d", invCount);
    }
}