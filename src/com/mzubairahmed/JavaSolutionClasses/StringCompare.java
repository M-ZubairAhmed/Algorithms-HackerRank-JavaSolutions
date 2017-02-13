package com.mzubairahmed.JavaSolutionClasses;
import java.util.*;

/**
 * @author zubair
 * @url https://www.hackerrank.com/challenges/java-string-compare
 * Created by zub on 13/02/2017.
 */
public class StringCompare {
    public static void FindLexGreatestLease(){
        Scanner scan = new Scanner(System.in);
        String ss = scan.nextLine();
        int div = scan.nextInt();
        scan.close();

        List<String> divisions = new LinkedList<>();
        for (int i = 0; i <= ss.length() - div; i++) {
            divisions.add(ss.substring(i,i+div));
        }
        System.out.println(Collections.min(divisions));
        System.out.println(Collections.max(divisions));

    }
}
