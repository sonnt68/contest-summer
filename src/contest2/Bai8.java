/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;

/**
 *
 * @author sonnt
 */
public class Bai8 {

    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int test = 0; test < testcase; test++) {
            long[][] matrix = new long[2][2];
            matrix[0][0] = 0;
            matrix[0][1] = 1;
            matrix[1][0] = 1;
            matrix[1][1] = 1;
            long n = sc.nextLong();
            matrix = powermod(matrix, n);
            System.out.println(matrix[1][1]);
        }
    }

    public static long[][] matrixTich(long a[][], long b[][]) {
        long[][] matrix = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    matrix[i][j] = (matrix[i][j] + a[i][k] * b[k][j]) % mod;
                }
            }
        }
        return matrix;
    }

    public static long[][] powermod(long[][] a, long n) {
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return a;
        }
        if (n % 2 == 0) {
            return matrixTich(a, powermod(a, n - 1));
        }
        long[][] tmp = powermod(a, n / 2 + 1);
        return matrixTich(tmp, tmp);
    }
}
