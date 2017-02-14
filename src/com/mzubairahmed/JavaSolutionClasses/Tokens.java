package com.mzubairahmed.JavaSolutionClasses;
import java.util.Scanner;
public class Tokens {
    public static void Token(){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        scan.close();

        string = string.trim();
        if (string.length() ==0){
//            return ;
        }

        String[] split = string.split("[A-Za-z !,?._'@]+");

        System.out.println(split.length);
        for(String iter : split){
            System.out.println(iter);
        }
    }
}

