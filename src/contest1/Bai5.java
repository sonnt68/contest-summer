/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

/**
 *
 * @author sonnt
 */
import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int test=0;test<testcase;test++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[k + 1];
            int[] b = new int[k + 1];
            for (int i = 1; i <= k; i++) {
                a[i] = sc.nextInt();
            }
            boolean check =true;
            for (int j = 1; j <= k; j++) {
                if(a[j]!=(n-k+j)) {
                    check=false;
                    break;
                }
            }
            if(check) {
                System.out.println(k);
            }else {
                for (int j = 1; j <= k; j++) {
                    b[j] = a[j];
                }
                int i = k;
                while (i > 0 && a[i] == n - k + i) {
                    --i;
                }		
                if (i > 0) {
                    a[i]++;
                    for (int j = i + 1; j <= k; j++) {
                        a[j] = a[j - 1] + 1;
                    }
                }
                int count = k;
                for (int j = 1; j <= k; j++) {
                    for (int m = 1; m <= k; m++) {
                        if (b[j] == a[m]) {
                            count--;
                            m = k;
                        }
                    }
                }
                System.out.println(count);
            }
        }
    }
}
