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
public class Bai4 {
    static int n, a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        sort();
        
    }
    
    static void sort() {
        boolean ok = false;
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(a[j] > a[j+1]) {
                    int tem = a[j]; a[j] = a[j+1]; a[j+1] = tem;
                    ok = true;
                    
                }
            }
            if(ok) {
                count++;
                System.out.print("Buoc " + count + ": ");
                for(int k = 0; k < n; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println("");
                ok = false;
            }
            
        }
    }
}
