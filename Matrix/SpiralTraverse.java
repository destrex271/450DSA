
import java.io.*;


/*
* 1  2  3  4
* 5  6  7  8
* 9 10 11 12
*/



public class SpiralTraverse {
    
    static BufferedReader bfr;

    public static void feed2DArray(int[][] arr)throws IOException{
        for(int i = 0; i < arr.length; i++){
            System.out.printf("Row %d\n", i+1);
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = Integer.valueOf(bfr.readLine());        
            }
        }
    }

    public static void main(String args[])throws IOException{

        // Input stuff
        bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of matrix");
        int n;
        n = Integer.valueOf(bfr.readLine());
        int arr[][] = new int[n][n];
        feed2DArray(arr);

        // Main logic
        int totalElements = n * n;
        int elemCovered = 0;
        int i = 0;
        int j = 0;
        int di = 1;
        int dj = 1;
        int i_up = 0;
        int j_up = n-1;
        int j_low = 0;
        int x_a = 0;
        boolean changingJ = true;

        System.out.println("\n-------------\n");

        while(elemCovered < totalElements){
            // System.out.printf("i : %d\tj : %d\n",i,j);
            System.out.println(arr[i][j]);
            // System.out.println("----------------------------------");
            if(changingJ){
                j += 1 * (int)Math.pow(-1,dj+1);
                if(j == j_up || j == j_low){
                    changingJ = false;
                    x_a++;
                    if(x_a == 2){
                        j_up--;
                        x_a = 0;
                    }
                    dj++;
                }
            }else{
                i += 1 * (int)Math.pow(-1,di+1);
                if(i == n-1 || i == i_up){
                    di++;
                    i_up++;
                    changingJ = true;
                }
            };
            elemCovered++;
        }
        System.out.println("Elem cov : " + elemCovered);
    }

}
