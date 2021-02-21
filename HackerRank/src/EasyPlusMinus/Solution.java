package EasyPlusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	
    	int noOfPlus = 0;
    	int noOfMinus = 0;
    	int noOfZero = 0;
    	
    	double plus = 0.000000;
    	double minus = 0.000000;
    	double zero = 0.000000;
    	
    	
    	for(int e : arr) {
    		if(e > 0) {
    			noOfPlus+=1;
    		} else if (e < 0) {
    			noOfMinus+=1;
    		} else {
    			noOfZero+=1;
    		}
    	}
    	
    	plus =  (double) noOfPlus / arr.length;
    	minus = (double) noOfMinus /arr.length;
    	zero = (double) noOfZero / arr.length;
    	
    	System.out.printf("%.6f\n", plus);
    	System.out.printf("%.6f\n", minus);
    	System.out.printf("%.6f\n", zero);
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
