/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author sonnt
 */
public class Bai9 {
    static int n, x[];
    static boolean ok;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int stt = in.nextInt();
            String s = in.nextLine();
            int k =1;
            x = new int[82];
            n = s.length();
            for(int i = 1; i< n; i++) x[k++] = s.charAt(i) - 48;
            n -= 1;
            ok = true;
            System.out.print(stt + " ");
            next();
            if(ok) 
                print();
            else System.out.println("BIGGEST");
        }
        
    }
    static void next() {
        int j = n-1;
        while(j > 0 && x[j] >= x[j+1]) j--;
        if(j > 0) {
            int k = n;
            
            while(x[j] >= x[k]) k--;
            int tem = x[j];
            x[j] = x[k];
            x[k] = tem;
            int r = j+1, s = n;
            while(r < s) {
                tem = x[r]; x[r] = x[s]; x[s] = tem;
                r++; s--;
            }
        }else ok = false;
    } 
    
    static void print() {
        for(int i = 1; i<=n; i++) {
            System.out.print(x[i]);
        }
        System.out.println("");
    }
}