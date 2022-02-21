import java.io.*;

public class BigFact {
    
    public static long fact(int y){
        long x = 1;
        for(int i = y; i >= 1; i--){
            x *= y;
        }
        return x;
    }

    public static void main(String args[])throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.valueOf(bfr.readLine());
        long fact = fact(x);
        System.out.println(fact);
    }

}
