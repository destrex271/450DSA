import java.util.*;

public class Test{

    public static void main(String args[]){
        int seconds = 10000;
        String x = getTime(seconds);
        System.out.println(x);
    }

    static String getTime(int seconds){
        String time = "";
        time += ((seconds/3600 < 10)?("0"+(seconds/3600)):(seconds/3600)) + ":";
        seconds /= 3600;
        //System.out.println(seconds);
        int y = 60 - seconds/60;
        if(y > 59) y = 0;
        time += (((y) < 10)?("0"+(y)):(y)) + ":";
        seconds /= 60;
        y = 60 - seconds;
        if(y > 59) y = 0;
        //System.out.println(seconds);
        time += (((y) < 10)?("0"+((y))):((y)));
        return time;
    }

}