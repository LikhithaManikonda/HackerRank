/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class UniqueUserNameRegistry
{
	public static void main(String[] args) throws IOException {
		String[] userNames;
		int n;
		System.out.println("Enter the size");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bufferedReader.readLine());
		userNames = new String[n];
		System.out.println("Enter "+n+" names");
		userNames = bufferedReader.readLine().split(" ");
		List<String> uniqueList = new ArrayList<String>();
		//iterating through array of names
	    for(int i=0;i<userNames.length;i++) {
	         boolean isElementInList = false,count=false;
	         String repeatedElement = null;
	            //iterating through list of unique names
	            for(String uniqueListNames:uniqueList) 
	            {
	                //if list already has name
	                if(userNames[i].length()==uniqueListNames.length() && userNames[i].equals(uniqueListNames.substring(0,userNames[i].length())) )
	                {      
	                    
	                       repeatedElement = uniqueListNames;
	                       isElementInList=true;
	                } 
	                try 
	                {
	                    if(userNames[i].length()+1==uniqueListNames.length()  && userNames[i].equals(uniqueListNames.substring(0,userNames[i].length()))
	                 && Integer.parseInt(String.valueOf(uniqueListNames.charAt(uniqueListNames.length()-1)))>=0)
	                    {
	                       repeatedElement = uniqueListNames;
	                       isElementInList=true;
	                       count=true;
	                    } 
	                }
	                catch(NumberFormatException nbe) 
	                {
	                    repeatedElement = null;
	                }
	            }

	             if(isElementInList==true  && repeatedElement!=null)
	             { 
	                 if(count==true ) {
	                 int no = Integer.parseInt(String.valueOf(repeatedElement.charAt(repeatedElement.length()-1)));
	                 no++;
	                 uniqueList.add(userNames[i].concat(String.valueOf(no)));

	                 }
	                 else 
	                       uniqueList.add(userNames[i].concat("1"));
	                 isElementInList = true; 
	             }
	           //if the list doesn't have the name.
	            if(isElementInList==false && repeatedElement==null)
	                uniqueList.add(userNames[i]);
	    }
		for(String uN:uniqueList) {
		    System.out.println("list elements "+uN);
		}
	}
}


