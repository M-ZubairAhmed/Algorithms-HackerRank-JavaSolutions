package com.mzubairahmed.JavaSolutionClasses;
import java.util.Scanner;
public class ExceptionHandling {
    public static void test(){
        Scanner scan  = new Scanner(System.in);
        while (scan.hasNextInt()){
            int n = scan.nextInt();
            int p = scan.nextInt();


        }
    }
    public long myCalculator(int n, int p) throws Exception{

            if (n < 0 || p < 0){
                throw new Exception("n and p should be non-negative");
            }
            else {
                return (long)Math.pow(n,p);
            }

    }
}
