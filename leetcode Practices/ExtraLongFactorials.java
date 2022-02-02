//Extra Long Factorials

//--------------------------------

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
         
        
        
        BigInteger x = BigInteger.valueOf(n);
        n = n - 1;
        while(n > 0){
            x = x.multiply(BigInteger.valueOf(n));
            n = n-1;
        }
        
        System.out.println(x.toString());
       
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
