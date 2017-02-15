package com.mzubairahmed.JavaSolutionClasses;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatch {
    public static void tryCatch(){
        Scanner scan = new Scanner(System.in);

        try{
            int a = scan.nextInt();
            int b = scan.nextInt();
            try{
                int c = a / b;
                System.out.println(c);
            }
            catch (ArithmeticException e){

            }
        }
        catch (InputMismatchException e){
            if (e != null){
                System.out.println("java.util.InputMismatchException");
            }
        }



    }
}
