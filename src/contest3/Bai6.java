/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.*;

/**
 *
 * @author sonnt
 */
public class Bai6 {

    static Scanner sc = new Scanner(System.in);
    static int a[][] = new int[1001][1001];
    static int n, m;

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0) {
            init();
            xuly();
        }
    }

    public static void init() {
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            a[x][y] = 1;
            a[y][x] = 1;

        }
    }

    public static void xuly() {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= n; j++) {
                if (a[i][j] == 1) {
                    System.out.print(j + " ");
                }

            }
            System.out.println("");
        }
    }
}
