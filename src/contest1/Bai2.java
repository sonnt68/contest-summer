/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

/**
 *
 * @author sonnt
 */
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for(int t = 1; t <= tc; t++){
            int n = in.nextInt();
            int max = n*n;
            int a[][] = new int[n][n];
            int d = 0;
            int h = n-1;
            int c = n-1;
            while(d<=n/2){
                for(int i = d; i < c; i++){
                    a[d][i] = max--;
                }
                for(int i = d; i < h; i++){
                    a[i][c] = max--;
                }
                for(int i = c; i >= d; i--){
                    a[h][i] = max--;
                }
                for(int i = h-1; i > d; i--){
                    a[i][d] = max--;
                }
                d++; c--; h--;
            }
            System.out.println("Test " + t + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]+ " ");
                }
                System.out.println("");
            }
        }
    }

}
