package EasyDiagonalDifference;

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

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	// Write your code here
    	//int result=0;
    	
    	int inxN=0;
    	int inxR=0;
    	
    	inxR = arr.get(0).size()-1;
    	
    	int calcN = 0;
    	int calcR = 0;
    	
    	for(List<Integer> e : arr) {
    		
    		System.out.println("N("+inxN+"):" + e.get(inxN));
    		calcN += e.get(inxN);
    		inxN+=1;
    		
    		System.out.println("R("+inxR+"):" + e.get(inxR));
    		calcR += e.get(inxR);
    		inxR-=1;
    		
    	}
    	
    	/*
    	for (int i=0; i<arr.get(0).size(); i++) { 	
    		System.out.println("i("+i+"):" + arr.get(i).get(i));
    		calcN += arr.get(i).get(i);    		
    	}
    	
    	for (int j=(arr.get(0).size()-1); j>=0; j--) { 	
    		System.out.println("j("+j+"):" + arr.get(j).get(j));
    		calcR += arr.get(j).get(j);	
    	}
    	*/
    	
    	System.out.println("calcN : " + calcN);
    	System.out.println("calcR : " + calcR);
    	System.out.println("Math.abs(calcN-calcR) : " + Math.abs(calcN-calcR));
    		
    	return Math.abs(calcN-calcR);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

