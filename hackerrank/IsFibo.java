// https://www.hackerrank.com/challenges/is-fibo

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _cases;
        _cases = in.nextInt();
     
        long n;
     
        for(int i=0; i<_cases; i++) {
            
            n = in.nextLong();

            if(Math.sqrt(5*Math.pow(n,2) + 4) % 1 == 0 || Math.sqrt(5*Math.pow(n,2) - 4) %1 == 0)
                System.out.println("IsFibo");
            else
                System.out.println("IsNotFibo");
        }     
   }
}