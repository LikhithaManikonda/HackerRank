//PROBLEM STATEMENT:
//https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other-using-hashmap-in-java/
/******************************************************************************

Online Java Compiler.
Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.math.BigInteger;
public class AnagramOrNotUsingHashMap
{
public static void main(String[] args) {
String s1 = "Hello";
String s2 = "oelHl";
HashMap<Integer,Character> h1 = new HashMap<Integer,Character>();
HashMap<Integer,Character> h2 = new HashMap<Integer,Character>();
for(int i=0;i<s1.length();i++){
h1.put(i,s1.charAt(i));
}
for(int i=0;i<s2.length();i++){
h2.put(i,s2.charAt(i));
}
Set<Entry<Integer,Character>> entrySet1 = h1.entrySet();
if(h1.size()==h2.size()) 
{
for(Entry<Integer,Character> eS1:entrySet1) {
h2.containsValue(eS1.getValue());
}
System.out.println("Given two strings are  Anagrams");
}
else {
System.out.println("Given two strings are not Anagrams");
}
}
BigInteger b;
}
