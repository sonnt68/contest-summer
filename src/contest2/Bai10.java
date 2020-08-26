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
public class Bai10 {

    static int n, a[], l[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            a = new int[n + 1];
            l = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Stack<Integer> st = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while (!st.empty() && a[st.peek()] <= a[i]) {
                    st.pop();
                }
                if (st.empty()) {
                    l[i] = n;
                } else {
                    l[i] = st.peek();
                }
                st.push(i);
            }
            for (int i = 0; i < n; i++) {
                System.out.print((l[i] == n ? -1 : a[l[i]]) + " ");
            }
            System.out.println("");

        }
    }
}
