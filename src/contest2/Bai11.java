/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sonnt
 */
public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int test = 0; test < testcase; test++) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            long[] dientich = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                int chieurong = 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (a[j] < a[i]) {
                        break;
                    } else {
                        chieurong++;
                    }
                }
                for (int j = i + 1; j <= n; j++) {
                    if (a[j] < a[i]) {
                        break;
                    } else {
                        chieurong++;
                    }
                }
                dientich[i] = (long) a[i] * chieurong;
            }
            long max = dientich[1];
            for (int i = 2; i <= n; i++) {
                if (dientich[i] > max) {
                    max = dientich[i];
                }
            }
            System.out.println(max);
        }
    }
}
