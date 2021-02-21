package EasyDayOfTheProgrammer;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
    	
    	if( year == 1918 ) {
    		return "26.09.1918";
    	}
		
		//String dt = "2020-01-01";  // Start date
		String dt = "01.01."+Integer.toString(year);  // Start date
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(dt));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		c.add(Calendar.DATE, 255); 
		dt = sdf.format(c.getTime());  // dt is now the new date
	        		
    	//return dt;
    	
    	if ( (year <= 1917) && (year%4 == 0) ){
            return "12.09." + Integer.toString(year);
        } 
    	else if( (year > 1918) && (year%400 == 0) ) {
    		return "12.09." + Integer.toString(year);
    	} else if ( (year%4 == 0) && (year%100 != 0)) {
    		return "12.09." + Integer.toString(year);
    	} else {
            return "13.09." + Integer.toString(year);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);
        System.out.println(result);
        
        
        /*
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
        */
        
        bufferedReader.close();
    }
}

