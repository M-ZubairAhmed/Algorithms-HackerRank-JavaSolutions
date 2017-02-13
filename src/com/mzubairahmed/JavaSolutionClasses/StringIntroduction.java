package com.mzubairahmed.JavaSolutionClasses;

import java.util.Scanner;

public class StringIntroduction {
    public static void Intro(){
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        System.out.println(A.length() + B.length());

        int lex = A.compareToIgnoreCase(B);
        if (lex < 0){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(2,A.length()) + " " + B.substring(0,1).toUpperCase() + B.substring(2,B.length()));
    }
}
