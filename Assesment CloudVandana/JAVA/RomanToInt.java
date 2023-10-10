/* enter a roman number as input and convert it to an integer(example is =9)

*/

import java.util.*;   
import java.io.*;   
import java.lang.Math;  
import java.util.Scanner;


public class ConvertRomanToInt {
    public static void main(String[] args) 
    {
        int n =0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman number : ");
        n=sc.nextInt();

        String romanNumeral = Scanner.nextLine().toUpperCase();
        int result = romanToInt(romanNumber);
        System.out.println("The integer value is: " + result);
    }

    public static int romanToInt(String s) 
    {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }
}

  
