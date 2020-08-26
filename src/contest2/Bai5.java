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
public class Bai5 {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long n, k;
        while(t-- > 0) {
            n = in.nextLong();
            k = in.nextLong();
            System.out.println( pow(n,k));
        }
        
    }
    
    static long sqr(long x) {
        return x*x;
    }
    
    static long pow(long n, long k) {
        if(k ==0) return 1 % mod;
        else {
            if(k % 2 == 0) {
                return sqr(pow(n, k/2))%mod;
            } else {
                return n * (sqr(pow(n, k/2))%mod)%mod;
            }                        
        }
    }
}
