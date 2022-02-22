
import java.util.*;
import java.io.*;

public class Maxprod {

    static BufferedReader bfr;

    public static int maxProd(int[] arr){
        int maxprd = arr[0] * arr[1];
        
        return maxprd;
    }

    public static void feedArray(int[] arr)throws IOException{
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.valueOf(bfr.readLine());
        }
    }
    
    public static void main(String args[])throws IOException{
        bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of your array");
        int len = Integer.valueOf(bfr.readLine());
        System.out.println("Enter the values in the array");
        int arr[] = new int[len];
        feedArray(arr);
        int x = maxProd(arr);
        System.out.println("Maximum sub array product is : ")
    }

}
