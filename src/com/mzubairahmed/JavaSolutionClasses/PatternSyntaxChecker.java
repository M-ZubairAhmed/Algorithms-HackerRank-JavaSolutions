package com.mzubairahmed.JavaSolutionClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Zubair_2 on 2/14/2017.
 */
public class PatternSyntaxChecker {
    public static void PatternCheck(){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-1; j++) {
                BigDecimal p = new BigDecimal(s[j-1]);
                BigDecimal q = new BigDecimal(s[j]);
                int diff = p.compareTo(q);
                if (diff == -1){
                    String temp = s[j-1];
                    s[j-1] = s[j];
                    s[j] = temp;
                }
            }
        }
        for(int i=0; i < n; i++)
        {
            for(int j=1; j <(n-i); j++)
            {

                int greater = new BigDecimal(s[j-1]).compareTo(new BigDecimal(s[j]));

                if(greater == -1){
                    String temp = s[j-1];
                    s[j-1] = s[j];
                    s[j] = temp;

                }
            }
        }





        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
