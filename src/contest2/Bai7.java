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
public class Bai7 {
    static int n;
    static long k, f[] = new long[93];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        f[0] = 0; f[1] = 1;
        for(int i = 2; i <= 92; i++) f[i] = f[i-2] + f[i-1];
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            k = in.nextLong();
            System.out.println(solve(n, k));
        }
    }
    
    static char solve(int n, long k) {
        if(n == 1) return 'A';
        if(n == 2) return 'B';
        if(k <= f[n-2]) return solve(n-2, k);
        else return solve(n-1, k-f[n-2]);
    }
}
