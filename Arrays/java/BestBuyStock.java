
import java.io.*;

public class BestBuyStock {

    static int buyStock(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = i;
            }
        }
        return min;
    }

    static int sellStock(int[] arr, int ind){
        if(ind == arr.length - 1) return -1;
        int max = arr[ind];
        for(int i = ind; i< arr.length; i++){
            if(arr[i] > max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String args[])throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bfr.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(bfr.readLine());
        }
        int indBuy = buyStock(arr);
        int indSell = sellStock(arr, indBuy);
        if(indSell == -1) System.out.println("No Profit can be made !");
        else{
            System.out.printf("Buy at Day: %d and sell at Day: %d for a maximum profit of %d\n", indBuy+1, indSell+1, arr[indSell] - arr[indBuy]);
        }
    }

}
