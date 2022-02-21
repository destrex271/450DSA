
import java.io.*;

public class SolnArrayShiftDown {
    
    public static BufferedReader bfr;

    static void feedArray(int[] arr)throws IOException{
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = Integer.valueOf(bfr.readLine());
        }
    }

    static void displayArray(int[] arr){
        System.out.println("------------------------------------------");
        for(int elem : arr){
            System.out.println(elem);
        }
        System.out.println("------------------------------------------");
    }

    static void insertArr(int[] arr, int from, int to){
        int temp = arr[to];
        arr[to] = arr[from];
        for(int i = to+1; i <= from; i++){
            int tx = arr[i];
            arr[i] = temp;
            temp = tx;
        }
    }

    public static void main(String[] args)throws IOException{
        bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter len");
        int len = Integer.valueOf(bfr.readLine());
        int[] arr = new int[len];
        System.out.println("Enter vals");
        feedArray(arr);
        displayArray(arr);
        System.out.println("Enter from then to");
        int from = Integer.valueOf(bfr.readLine());
        int to = Integer.valueOf(bfr.readLine());
        insertArr(arr, from, to);
        displayArray(arr);
    }

}
