//Write a program that takes on integer(between 2 and 20), both numbers inclusive and an array of N integers as input. This array is composed of three arithmetic progression(AP) linked together in exactly two links.
//Your programneeds to output each AP separated by online in the order of the input
//Ex input: 
//8
//1 2 3 7 10 13 22 24
//o/p: 123
// 7 10 13
//22 24
import java.io.*; 
import java.util.*;
public class CertificationQuestion  
{
 	public static void main (String[] args) throws java.lang.Exception 
 	{

     	//use the following code to fetch input from console 
     	String line;
        System.out.println("Enter the value betwee 2 and 20 inclusive");
     	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in)); 
     	line=inp.readLine();
        int number = Integer.parseInt(line) , i=0;
        int[] integerArray = new int[number];
        System.out.println("Enter  " +number+ " array elements");
        String[] StringArray = inp.readLine().split(" ");
        ArrayList<Integer> subarray = new ArrayList<Integer>();
        for(String strAr: StringArray) {
          integerArray[i] = Integer.parseInt(strAr);
          i++;
        }
        int difference = integerArray[1] - integerArray[0];
        //System.out.println(integerArray[0]+""+integerArray[1]);
        subarray.add(integerArray[0]);
        subarray.add(integerArray[1]);
        if(number>=2 && number<=20) {
          for(int j=1;j<integerArray.length;j++) 
          {
                if(j==integerArray.length-1 ||integerArray[j+1]-integerArray[j] != difference)
                {
                    for(Integer sa:subarray) {
                        System.out.print(sa);
                    }
                    subarray.clear();
                    System.out.println();
                    difference = integerArray[j+2]-integerArray[j+1];
                    subarray.add(integerArray[j+1]);
                }
                else 
                {
                    subarray.add(integerArray[j+1]);                }
           }
        }
      
    }
}