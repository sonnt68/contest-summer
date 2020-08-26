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
public class Bai1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long F[] = new long[93];
        F[0] = 0;
        F[1] = 1;
        for(int i=2; i<=92; i++){
            F[i] = F[i-1] + F[i-2];
        }
        int t,n;
        t = in.nextInt();
        while(t-- > 0){
            n = in.nextInt();
            System.out.println(F[n]);
        }
    }

}
