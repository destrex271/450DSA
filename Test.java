import java.io.*;

public class Test{

    public static void main(String args[])throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String x = bfr.readLine().trim() + " ";
        String nw = "";
        String wrd = "";
        for(int i  = 0; i < x.length(); i++){
            char c = x.charAt(i);
            if(c != ' '){
                wrd += c;
                System.out.println(wrd);
            }else{
                if(Character.isLetter(wrd.charAt(0))){
                    String naw = "";
                    naw += Character.toUpperCase(wrd.charAt(0));
                    naw += wrd.substring(1);
                    nw += naw + " ";
                }
                wrd = "";
            }
        }
        System.out.println(nw);
    }

}