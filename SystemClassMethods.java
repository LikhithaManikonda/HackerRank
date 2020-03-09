/***************************************************************************

Online Java Compiler.
Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.Console;
public class SystemClassMethods
{
int i;
String s;
SystemClassMethods(int ii,String str) {
i = ii;
s = str;
}
public static void main(String[] args) {
show();
System.gc();
}
static void show() {
new SystemClassMethods(10,"Likhitha");
new SystemClassMethods(20,"Manikonda");
System.out.println(Runtime.getRuntime().toString());
System.out.println("Total Memory of JVM "+Runtime.getRuntime().totalMemory());
System.out.println("Free Memory Before Garbage collection "+Runtime.getRuntime().freeMemory());
Runtime.getRuntime().gc();
System.out.println("OS Name "+System.getProperty("os.name"));
System.out.println("Current Time "+System.currentTimeMillis());
Console c = System.console();
if(c!=null){
System.out.println(c.printf("Hellooo")); }
else System.out.println("No console");
System.out.println("Free Memory After Garbage collection"+Runtime.getRuntime().freeMemory());
System.out.println("JVM is gonna terminate.....");
System.exit(0);
System.out.println("Terminated...");

}
protected void finalize() throws Throwable {
System.out.println("Garbage collected object"+this.s);
}
}
