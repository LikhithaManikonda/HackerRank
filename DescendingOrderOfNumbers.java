/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
public class DescendingOrderOfNumbers
{
    static int len,i=0;
    static int[] listOfNumbers;
    static String[] s;
	public static void main(String[] args) throws IOException
	{
	    System.out.println("Enter array size");
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	    len = Integer.parseInt(bufferedReader.readLine());
	    listOfNumbers = new int[len];
	    System.out.println("Enter array elements");
	    s = new String[len];
	    s = bufferedReader.readLine().split(" ");
	    for(String str:s) {
	        listOfNumbers[i] = Integer.parseInt(str);
	        i++;
	    }
    	
	    DescendingOrderOfNumbers m = new DescendingOrderOfNumbers();
        Arrays.sort(listOfNumbers);
        System.out.println("Ascending Order of an array");
        for(int i=0;i<listOfNumbers.length;i++) {
            System.out.println(listOfNumbers[i]);
        }
        listOfNumbers = m.descendingSortedArray(listOfNumbers);
        System.out.println("Descending Order of an array");
        for(int i=0;i<listOfNumbers.length;i++) {
            System.out.println(listOfNumbers[i]);
        }
        
	}
	

    int[] descendingSortedArray(int[] listOfNumbers) 
    {
        int  j = DescendingOrderOfNumbers.len-1, temp =0;
        for(int i=0;i<DescendingOrderOfNumbers.len;i++)
        {
            if(DescendingOrderOfNumbers.len%2==0) 
            {
                temp = listOfNumbers[i];
                listOfNumbers[i] = listOfNumbers[j];
                listOfNumbers[j] = temp;
                j--;
                if(i==j){
                    break;
                }
            }
            else 
            {
                temp = listOfNumbers[i];
                listOfNumbers[i] = listOfNumbers[j];
                listOfNumbers[j] = temp;
                j--; 
                if(j==DescendingOrderOfNumbers.len/2) 
                {
                    break;
                }
            }
        }
        //or
        /* int[] descendingSortedArray(int[] listOfNumbers) 
    {
        int  j = Main.len-1, temp =0;
        for(int i=0;i<Main.len;i++)
        {
            
                temp = listOfNumbers[i];
                listOfNumbers[i] = listOfNumbers[j];
                listOfNumbers[j] = temp;
                j--;
                if((i==j && Main.len %2 == 0) || (j==Main.len/2 && Main.len % 2 != 0) ) {
                    break;
                }
        }
        return listOfNumbers;
    }*/
        return listOfNumbers;
    }
}