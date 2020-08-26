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
public class Bai7 {

    static Scanner sc = new Scanner(System.in);
    static int a[][] = new int[1001][1001];
    static int n, m;

    public static void main(String[] args) {
        init();
        xuly();
    }

    public static void init() {
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            String mang[] = s.split(" ");
            m = mang.length;
            for (int j = 0; j < m; j++) {
                int x = i;
                int y = Integer.parseInt(mang[j]);
                a[x][y] = 1;
                a[y][x] = 1;
            }
        }
    }

    public static void xuly() {
        for (int i = 1; i <= n - 1; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (a[i][j] == 1) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
