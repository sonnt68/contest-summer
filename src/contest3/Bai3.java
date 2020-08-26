/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.Scanner;

/**
 *
 * @author sonnt
 */
public class Bai3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n, s, a[];
            n = in.nextInt();
            s = in.nextInt();
            a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
            }
            boolean x[] = new boolean[s + 1];

            for (int i = 0; i <= s; i++) {
                x[i] = false;
            }
            x[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = s; j >= a[i]; j--) {
                    if (!x[j] && x[j - a[i]]) {
                        x[j] = true;
                    }
                }
            }
            System.out.println(x[s] ? "YES" : "NO");
        }
    }
}
