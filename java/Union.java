import java.util.*;

public class Union {
    public static void main(String[] args){
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        int[] fin = new int[n1+n2];
        int i = 0;
        int finlen = n1+n2;
        for(i = 0; i < n1; i++){
            fin[i] = arr1[i];
        }
        for(int j = 0; j < n2; j++,i++){
            fin[i] = arr2[j];
        }
        System.out.println("---------------------------------------------------------------------------------");
        for(i = 0; i < finlen; i++){
            System.out.println(fin[i]);
        }
    }    
}
