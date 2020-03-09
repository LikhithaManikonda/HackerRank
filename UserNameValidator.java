import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserNameValidator{
     public static void main(String []args) throws IOException{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int noOfStrings = Integer.parseInt(bufferedReader.readLine());
            String[] names = new String[noOfStrings];
            names = bufferedReader.readLine().split(" ");
            for(String name:names) {
            int asciiValueOfFirstCharacter = (int) name.charAt(0);
            int lengthOfName = name.length();
            boolean match = false;
            //checking first character is Capital and length b/w 8 and 30 inclusive
            if((asciiValueOfFirstCharacter >=65 && asciiValueOfFirstCharacter<=90) && (lengthOfName>=8 && lengthOfName<=30)) 
            {
                //checking each character is alphanumeric
                for(int i=0;i<name.length();i++) {
                    int asciiValueOfEachCharacter = (int)name.charAt(i);
                    if((asciiValueOfEachCharacter>=65 && asciiValueOfEachCharacter <=90)
                    || (asciiValueOfEachCharacter>=97 && asciiValueOfEachCharacter<=122) || 
                    (asciiValueOfEachCharacter>=48 && asciiValueOfEachCharacter<=57) || (asciiValueOfEachCharacter) == 95)
                    {
                     match = true;
                    }
                    else {
                        match = false;
                        break;
                    }
                }
            }
            if(match == true) {
                System.out.println(name+" Name is Valid");
            }
            else {
                System.out.println(name+" Name is InValid");
            }
            } 
            //String[] s = new String[2];
    	    //List<Double> inputList = new ArrayList<Double>();
    	    
     }
}