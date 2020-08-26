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
public class Bai4 {

    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(Tohop(n, k));
        }

    }

    public static long Tohop(int n, int k) {
        long a[][] = new long[1001][1001];
        if (k == 0 || k == n) {
            return 1 % mod;
        } else {
            for (int i = 0; i <= k; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == 0 || i == j) {
                        a[i][j] = 1;
                    } else {
                        a[i][j] = a[i][j - 1] + a[i - 1][j - 1] % mod;
                    }
                }
            }
        }
        return a[k][n] % mod;
    }
}
