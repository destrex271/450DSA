import java.io.*;

public class Pairsum{

    static int countPairs(int[] arr, int sum){
        int count = 0;
        for(int i = 0 ; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    count++;
                }
            }
        }
        return count;
    }

    static void displayArray(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n-------------------------------------------");
    }

    public static void main(String args[])throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bfr.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(bfr.readLine());
        }
        System.out.println("Enter Sum -><-");
        int sum = Integer.valueOf(bfr.readLine());
        displayArray(arr);
        int cnt = countPairs(arr, sum);
        System.out.println((cnt == 0)?"No Pairs were found :(":("Total pairs are : " + cnt));
    }
}