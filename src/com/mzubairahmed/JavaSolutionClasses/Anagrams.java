package com.mzubairahmed.JavaSolutionClasses;

import java.util.Scanner;

/**
 * Created by zub on 13/02/2017.
 */
public class Anagrams {
    public static boolean isAnagram() {
        Scanner scan = new Scanner(System.in);
        String Str1 = scan.next();
        Str1 = Str1.toLowerCase();

        String Str2 = scan.next();
        Str2 = Str2.toLowerCase();
        scan.close();

        int[] alphaFreq1 = new int[26];
        int[] alphaFreq2 = new int[26];

        for (int i = 0; i < Str1.length(); i++) {
            int posAlpha1 = Str1.charAt(i) - 97;
            alphaFreq1[posAlpha1] = alphaFreq1[posAlpha1] + 1;

        }
        for (int i = 0; i < Str2.length(); i++) {
            int posAlpha2 = Str2.charAt(i) - 97;
            alphaFreq2[posAlpha2] = alphaFreq2[posAlpha2] + 1;
        }

        boolean isAna = true;
        for (int j = 0; j < 26; j++) {
            if (alphaFreq1[j] == alphaFreq2[j]) {
                continue;
            } else {
                isAna = false;
                break;
            }
        }

        return isAna;
    }
}
