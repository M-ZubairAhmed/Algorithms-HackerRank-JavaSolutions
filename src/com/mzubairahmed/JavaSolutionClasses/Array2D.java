package com.mzubairahmed.JavaSolutionClasses;
import java.util.Scanner;
public class Array2D {
    public static void test(){
        Scanner in = new Scanner(System.in);
        int ar[][] = new int[6][6];
//        int ar[][] = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
        for(int l=0; l < 6; l++){
            for(int m=0; m < 6; m++){
                ar[l][m] = in.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int tRow = i;
                int tSum = ar[tRow][j] + ar[tRow][j+1] + ar[tRow][j+2];
                int mSum = ar[i+1][j+1];
                int lRow = i+2;
                int lSum = ar[lRow][j] + ar[lRow][j+1] + ar[lRow][j+2];
                int temp = tSum + mSum + lSum;
                if (temp > maxSum){
                    maxSum = temp;
                }
            }
        }
        System.out.println(maxSum);
    }
}
