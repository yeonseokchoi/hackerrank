package EasyTimeConversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String tArr[] = s.split(":");
        String ssStr = tArr[2].substring(0,2);
        String AmPm = tArr[2].substring(2,4);
        
        int hh = Integer.parseInt(tArr[0]);
        String checkPM = "PM",checkAM ="AM";
        
        if(AmPm.equals(checkAM) && hh==12)
        	hh=0;
        else if(AmPm.equals(checkPM)&& hh<12)
        	hh+=12;
        
        if(hh < 10)
        	tArr[0] = "0" + Integer.toString(hh);
        else
        	tArr[0] = Integer.toString(hh);
        
        
    	return tArr[0]+":"+tArr[1]+":"+ssStr;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
        

        //bw.write(result);
        //bw.newLine();

        //bw.close();
    }
}

