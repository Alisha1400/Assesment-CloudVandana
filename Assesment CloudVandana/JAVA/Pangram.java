/*Check if the input is pangram or not.

*/
import java.util.*;


public class Pangram 
{  

public static void containAllLetters(String string)  
{  
 
string = string.toLowerCase();  
boolean allLetterPresent = true;  
  
for (char ch = 'a'; ch <= 'z'; ch++)   
{  
 
if (!string.contains(String.valueOf(ch)))   
{  
allLetterPresent = false;  
break;  
}  
}  

if (allLetterPresent) 
{ 
System.out.println("It is a Pangram String ");

else
   
System.out.println("It is not a Pangram String ");  
}  
  
public static void main(String args[])  
{  
  
String string = "Abcdefghijklmnopqrstuvwxyz12";  
  
containAllLetters(string);  
}  
}  