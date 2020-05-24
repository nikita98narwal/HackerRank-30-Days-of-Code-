//package HackerRank;
//
//import java.util.regex.*;
//
//public class Day9 {
//
//    // Complete the factorial function below.
//    static int factorial(int n) {
//        //for(int i = 0; i <= n-1; i++ ){
//        if(n <= 1){
//            return 1;
//        }
//        //else{
//            return n * factorial(n-1);
//        }
//        //}
//    //}
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int result = factorial(n);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
//}
//
//










//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Day9 {
//    public static int factorial(int n)//factorial method
//        {
//            if (n == 0)
//            {
//                return 1;
//            }else if (n < 1)
//                {
//                return -1;
//            }else 
//                {
//                return n * factorial(n -1);
//            }
//        
//    }
//
//    public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//        // System.out.println("Enter number to factorize ");
//         int n = input.nextInt();
//         System.out.println(factorial(n) );
//    }
//}