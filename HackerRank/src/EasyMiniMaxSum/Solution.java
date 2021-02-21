package EasyMiniMaxSum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	
    	long resultA = 0;
    	long resultB = 0;

    	Arrays.sort(arr);
    	
    	/*
    	ArrayList<Integer> arrList = new ArrayList<Integer>(arr.length);
    	for (int e : arr) {
    		arrList.add(e);
    		System.out.println(e);
    	}
    	*/
    	
    	for(int i=0; i<arr.length; i++) {
    		
    		if( i==0 ) {
    			resultA+=arr[i];
    		} else if ( i==(arr.length-1) ) {
    			resultB+=arr[i];
    		} else {
    			resultA+=arr[i];
    			resultB+=arr[i];
    		}
    		
    	}
    	
    	System.out.println(resultA + " " + resultB);    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
