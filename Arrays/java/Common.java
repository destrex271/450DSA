import java.io.*;
import java.util.HashMap;
import java.util.Arrays;

public class Common{

    static BufferedReader bfr;
    static HashMap<String,Integer> map = new HashMap<String, Integer>();
    static int banval = -13131313;

    static void feedArray(int[] arr, int n)throws IOException{
        for(int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(bfr.readLine());
        }
    }

    static boolean doesExist(int elem, int[] arr){
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        while(low <= high){
            int mid = (high+low)/2;
            if(arr[mid] == elem){
                found = true;
                break;
            }
            else if(elem > arr[mid]){
                low = mid + 1;
            }
            else if(elem < arr[mid]){
                high = mid - 1;
            }
        }
        return found;
    }

    // Feed Common elements to hash map
    public static void getCom(int[] arr1, int[] arr2, int[] arr3, int len){
        for(int i = 0; i < arr1.length; i++){
            int ele = arr1[i];
            System.out.println(ele);
            if(doesExist(ele, arr2) && doesExist(ele, arr3)){
                if(!map.containsKey(ele + "")){
                    map.put(ele+"", 1);
                }else{
                    map.replace(ele+"", map.get(ele), map.get(ele)+1);
                }
            };
        }
    }

    // Get all keys from hashmap
    static void getAllKeys(){
        System.out.println("--------------------------------- Common Elements --------------------------------------");
        for(String key : map.keySet()) System.out.print(key + " ");
        System.out.println("\n---------------------------------------------------------------------------------------");
    }

    public static void main(String args[])throws IOException{
        bfr = new BufferedReader(new InputStreamReader(System.in));
        int n1, n2, n3;
        int[] arr1, arr2, arr3;

        // Adding elements to first array
        System.out.println("Array 1 length");
        n1 = Integer.valueOf(bfr.readLine());
        arr1 = new int[n1];
        System.out.println("Array 1 data");
        feedArray(arr1, n1);
        Arrays.sort(arr1);

        // Adding elements to second array
        System.out.println("Array 2 length");
        n2 = Integer.valueOf(bfr.readLine());
        arr2 = new int[n2];
        System.out.println("Array 2 data");
        feedArray(arr2, n2);
        Arrays.sort(arr2);

        // Adding elements to third array
        System.out.println("Array 3 length");
        n3 = Integer.valueOf(bfr.readLine());
        arr3 = new int[n3];
        System.out.println("Array 3 data");  
        feedArray(arr3, n3);
        Arrays.sort(arr3);

        // Common elements hashmap
        System.out.println("\n-------------------------------------------------------------------------------------------");
        getCom(arr1, arr2, arr3, n1+n2+n3);
        getAllKeys();

    }
}