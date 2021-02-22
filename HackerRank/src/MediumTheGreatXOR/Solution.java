package MediumTheGreatXOR;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the theGreatXor function below.
    static long theGreatXor(long x) {
    	
    	long result = 0;
    	
    	String biStrX = Long.toBinaryString(x); // "1001"
    	System.out.println("biStrX : " + biStrX);
    	
    	for (long i=1; i<x; i++) {
    		    		
    		String biStrAXORX = "";
    		String biStrA = Long.toBinaryString(i); 
    		
    		// "10" → "0010"
    		int diff = biStrX.length()-biStrA.length();
    		for (int j=0; j<diff; j++) {
    			biStrA = "0" + biStrA;
    		}
    		//System.out.println("biStrA : " + biStrA);
    		
    		char[] biStrXChars = biStrX.toCharArray();
    		int index = biStrA.indexOf("1");
    		LinkedList<Integer> indexes = new LinkedList<Integer>();
    		while (index >= 0) {
    		    indexes.add(index);
    		    
    		    if ( biStrXChars[index] == '0'){
    				biStrXChars[index] = '1';
    			} else {
    				biStrXChars[index] = '0';
    			}
    		    
    		    index = biStrA.indexOf("1", index + 1);		    
    		}
    		
    		biStrAXORX = String.valueOf(biStrXChars);
    		//System.out.println("biStrAXORX : " + biStrAXORX);
    		
    		long decimal = Long.parseLong(biStrAXORX, 2); 
    		
    		if ( decimal > x ) {
    			result+=1;
    		}

    	}
    	
    	
    	
    	System.out.println("result : " + result);	
		return result;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long x = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = theGreatXor(x);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
