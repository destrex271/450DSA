import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SolnZeroSubArray {
    
    static BufferedReader bfr;

    static void feedArray(int[] arr)throws IOException{
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.valueOf(bfr.readLine());
        }
    }

    public static void main(String args[])throws IOException{
        bfr = new BufferedReader(new InputStreamReader(System.in));
        int arr[], len, freq = 0;

        // Getting array length and feeding data
        System.out.println("Enter the length of the array");
        len = Integer.valueOf(bfr.readLine());
        arr = new int[len];
        Arrays.sort(arr);

        // Searching if any of the elements is nto zero
        if(Arrays.binarySearch(arr, 0) != -1){
            freq++;
        }


    }

}
