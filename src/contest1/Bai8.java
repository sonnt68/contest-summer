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
public class Bai8 {
    static int n, k, x[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            x = new int[20];
            Try(1);
        }
        
    }
    
    
    public static void Try(int i) {
        for(int j = 0; j <= 1; j++) {
            x[i] = j;
            if(i == n) print();
            else Try(i+1);
        }
    }
    
    public static void print() {
        int count = 0; // dem so so 1
        for(int i = 1; i <= n; i++) {
            if(x[i] == 1 ) count++;
        }
        if(count == k) {
            for(int i = 1; i <= n; i++) {
                System.out.print(x[i]);
            }
            System.out.println("");
        }
        
    }
}