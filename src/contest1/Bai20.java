/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.Scanner;

/**
 *
 * @author sonnt
 */
public class Bai20 {
    static int n,k,RES,S;
    static int[] t = new int[100];

    static void sinh(int i, int S, int soto){
        if (S<0) return ;
        if (i==n+1 && S==0) {
            if(RES>=soto) {
                RES = soto ;
            }
            return; 
        }
        if (i==n+1) return ;
        sinh (i+1,S,soto);
        sinh (i+1,S-t[i],soto+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0) {
            n= sc.nextInt();
            S = sc.nextInt();
            RES = n+1;
            for (int i=1; i<=n; i++){
                t[i] = sc.nextInt();
            }
            sinh(1,S,0);
            if (RES == n+1) RES = -1;
            System.out.println(RES);
        }
    }
}