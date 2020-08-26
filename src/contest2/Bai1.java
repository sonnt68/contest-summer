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
public class Bai1 {
    static int n, a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1];
        for(int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        sort();
        
        
    }
    
    static void sort() {
        for(int i = 1; i < n; i++) {
            for(int j = i+1; j<= n; j++) {
                if(a[i] > a[j]) {
                    int tem = a[i];
                    a[i] = a[j];
                    a[j] = tem;
                }
            }
            System.out.print("Buoc " + i + ": ");
            for(int k = 1; k <= n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println("");
        }
    }
}
