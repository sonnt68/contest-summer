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
public class Bai11 {

    public static Scanner in = new Scanner(System.in);
    public static boolean cx[] = new boolean[1001];
    public static int a[][] = new int[1001][1001];
    public static int truoc[] = new int[1001];
    public static int m, n, start, finish;

    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) {
            init();
            Dfs(start);
            if (cx[finish]) {
                System.out.println("-1");
            } else {
                solve();
            }
        }
    }

    public static void solve() {
        int res = 1;
        int u = finish;
        while (truoc[u] != start) {
            u = truoc[u];
            res++;
        }
        System.out.println(res);
    }

    public static void init() {
        n = in.nextInt();
        m = in.nextInt();
        start = in.nextInt();
        finish = in.nextInt();
        for (int i = 1; i <= n; i++) {
            cx[i] = true;
            Arrays.fill(a[i], 0);
            Arrays.fill(truoc, 0);
        }
        for (int i = 1; i <= m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            a[x][y] = 1;
            a[y][x] = 1;
        }
    }

    public static void Dfs(int u) {
        Stack st = new Stack();
        st.push(u);
        cx[u] = false;
        while (!st.isEmpty()) {
            int s = (int) st.peek();
            st.pop();
            for (int t = 1; t <= n; t++) {
                if (cx[t] && a[s][t] == 1) {
                    cx[t] = false;
                    st.push(s);
                    st.push(t);
                    truoc[t] = s;
                    if (t == finish) {
                        return;
                    }
                    break;
                }
            }
        }
    }
}
