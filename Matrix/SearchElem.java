import java.io.*;
import java.util.*;


public class SearchElem{

    static BufferedReader bfr;

    static void feedMatrix(int[][] arr)throws IOException{
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                arr[i][j] = Integer.valueOf(bfr.readLine());
            }
        }
    }

    static void displayHighLightedMatrix(int[][] arr, int x, int y){
        System.out.println("---------------------------------------------------------");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == x && j == y){
                    System.out.print("\b|");
                }
                System.out.printf("%d ",arr[i][j]);
                if(i == x && j == y){
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");
    }

    static int[] searchElem(int[][] arr, int elem){
        int[] pos = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                if(arr[i][j] == elem){
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }

    public static void main(String args[])throws IOException{
        bfr = new BufferedReader(new InputStreamReader(System.in));
        int m, n;
        System.out.println("Enter the dimensions of the matrix");
        m = Integer.valueOf(bfr.readLine());
        n = Integer.valueOf(bfr.readLine());
        int arr[][] = new int[m][n];
        feedMatrix(arr);
        int pos[] = searchElem(arr, Integer.valueOf(bfr.readLine()));
        int x = pos[0];
        int y = pos[1];
        if(pos[0] != -1){
            System.out.println("Element found at : (" + x + ", " + y + ")" );
        }else{
            System.out.println("Element does not exist in this array.");
        }
        displayHighLightedMatrix(arr, x, y);
    }

}