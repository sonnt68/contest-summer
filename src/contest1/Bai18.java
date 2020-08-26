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
public class Bai18 {
    static int n,RES=0;
    static int[] cot=new int[50],cheo1 = new int[50],cheo2 = new int[50];
    static void sinh(int i){
        if (i==n+1) {
            RES++;
            return ;
        }
        for (int j=1; j<=n; j++){
            if (cot [j]==0 && cheo1[i-j+n]==0 && cheo2[i+j]==0){
                cot[j] = 1;
                cheo1[i-j+n] = 1;
                cheo2[i+j] =1;
                sinh(i+1);
                cot[j] = 0;
                cheo1[i-j+n] = 0;
                cheo2[i+j] =0;	
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            n = sc.nextInt();
            sinh(1);
            System.out.println(RES);;
        }
    }
}