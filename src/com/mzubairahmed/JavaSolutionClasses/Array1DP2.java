package com.mzubairahmed.JavaSolutionClasses;
import java.util.Scanner;
public class Array1DP2 {
    public static void test(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases-- > 0){
            int len = scan.nextInt();
            int maxJump = scan.nextInt();
            int[] ar = new int[len];
            for (int z = 0; z < len; z++) {
                ar[z] = scan.nextInt();
            }

            boolean situation = false;
            int i = 0;
            while(ar[0] != 1){
                  if (i + 1 < len && ar[i + 1] == 0) {
                      if (i++ > len - 1)
                  }
            }





            }
            if (situation){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
