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
public class Bai9 {

    static int[][] a = new int[1002][1002];

    static int n, m, Free[] = new int[1002], u, v, s;

    static void DFS(int u) {
        System.out.print(u + " ");
        Free[u] = 0;
        for (int v = 1; v <= n; v++) {
            if (a[u][v] == 1 && Free[v] == 1) {
                DFS(v);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    a[i][j] = 0;
                }
            }

            for (int i = 1; i <= m; i++) {
                u = sc.nextInt();
                v = sc.nextInt();
                a[u][v] = 1;
                a[v][u] = 1;
            }

            for (int i = 1; i <= n; i++) {
                Free[i] = 1;
            }
            DFS(s);
            System.out.println();
        }
    }
}