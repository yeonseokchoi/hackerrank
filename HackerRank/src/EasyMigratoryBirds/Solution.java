package EasyMigratoryBirds;

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

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
    	
    	ArrayList<Integer> noDupArr = new ArrayList<Integer>();
    	for(Integer data : arr){
    	    if(!noDupArr.contains(data))
    	    	noDupArr.add(data);
    	}
    	
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(noDupArr.size());
    	for (int k=0; k<noDupArr.size(); k++) {
	        map.put(noDupArr.get(k), 0);
	    }
    	
    	for (int i=0; i<arr.size(); i++) {
    		
    		int val = map.get(arr.get(i));
    		
    		for (int j=0; j<noDupArr.size(); j++) {
    			if (arr.get(i) == noDupArr.get(j)) {
    				val+=1;
    				map.put(arr.get(i), val);
    			}
    		}
    	}
    	
    	int type = 0;
    	int noOfBirds = 0;
    	
    	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    	    int key = entry.getKey();
    	    int val = entry.getValue();
    	    
    	    if (val > noOfBirds) {
    	    	type = key;
    	    	noOfBirds = val;
    	    } else if (val == noOfBirds && key < type) {
    	    	type = key;
    	    	noOfBirds = val;
    	    }
    	}
    	
    	return type;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);
        
        /*
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        */
        bufferedReader.close();

    }
}
