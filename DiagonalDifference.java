
//Problem : https://www.hackerrank.com/challenges/diagonal-difference/problem
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	class Result {

	    /*
	     * Complete the 'diagonalDifference' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	     */

	    public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
	        int firstDiagonal = 0,secondDiagonal = 0,i=0,j=arr.size();
	        for(List<Integer> ar:arr) {
	            firstDiagonal = firstDiagonal+ar.get(i);
	            i++;
	            secondDiagonal = secondDiagonal+ar.get(j-1);
	            j--;
	            
	        }
	        int diagonalDifference = firstDiagonal-secondDiagonal;
	        return Math.abs(diagonalDifference);
	    }

	}

	public class DiagonalDifference {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<List<Integer>> arr = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	            List<Integer> arrRowItems = new ArrayList<>();

	            for (int j = 0; j < n; j++) {
	                int arrItem = Integer.parseInt(arrRowTempItems[j]);
	                arrRowItems.add(arrItem);
	            }

	            arr.add(arrRowItems);
	        }

	        int result = Result.diagonalDifference(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
