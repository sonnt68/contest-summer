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
public class Bai6 {
    static long n, k;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextLong(); k = in.nextLong();
            System.out.println(solve(n, k));
        }
        
    }
    
    static long solve(long n, long k) {
        long x = (long)Math.pow(2, n-1);
        if(k == x) return n;
        else if(k < x) return solve(n-1, k);
        else return solve(n-1, k-x);
    }
}
