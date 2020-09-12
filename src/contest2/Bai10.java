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
public class Bai10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            for (int i = 0; i < n - 1; i++) {
                int j = i + 1;
                while (j < n && a[j] <= a[i]) {
                    j++;
                }
                if (j < n) {
                    System.out.print(a[j] + " ");
                } else {
                    System.out.print("-1 ");
                }
            }
            System.out.println("-1");
        }
    }
}
