package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int rem =0, count = 0, min = 0;
        while(n > 0){
            rem = n%2;
            n = n/2;
            if(rem == 1){
                count++;
                if(count > min){
                    min = count;
                }
            }
                else{
                    count = 0;
                }
                     
        }
        System.out.print(min);
        scanner.close();
    }
}

	