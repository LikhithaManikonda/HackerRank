/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Any number can be called happy number, if on reapeatedly replacing it with sum of squares of its digits, it leads to 1. All those numbers which 
//are "not happy", stuck in a cycle of numbers which never leads to 1

import java.io.*;
public class HappyNoOrNot
{
	public static void main(String[] args) throws IOException 
	{
	    int n=0 ,digit,squareOfANumber =0,temp;
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	    String Number = bufferedReader.readLine();
	    n= Integer.parseInt(Number);
	    temp = n;
	    do 
	    {
	         while(n>0) 
	         {
	            digit = n%10;
	            squareOfANumber += digit*digit;
	            n = n/10;
	         }
	      n=squareOfANumber;
	      squareOfANumber = 0;
	    } while(n!=temp && n != 1);
	    if(n == temp) {
	        System.out.println("Not Happy No");
	    }
	    if(n == 1) {
	        System.out.println(" Happy No");
	    }
	}
}

