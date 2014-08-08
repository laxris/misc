/* My solution to				  *
 * https://www.hackerrank.com/challenges/easy-sum *
 *						  */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static long easySum(long N, long m) {   
            return ((m-1)*m/2)*(N/m) + (N%m)*((N%m)+1)/2;
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _cases;
        _cases = in.nextInt();
     
        for(int i=0; i<_cases; i++) {
            long _N, _m;
            _N = in.nextLong();
            _m = in.nextLong();
         
            System.out.println(easySum(_N, _m));
        }     
   }
}