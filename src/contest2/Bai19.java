/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.*;

/**
 *
 * @author sonnt
 */
public class Bai19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        in.nextLine();
        while (tc-- > 0) {
            String str = in.nextLine();
            int len = str.length();
            char[] s = new char[len+1];
            int []a = new int [len+1];
            a[0] = 1; s[0] = 'S';
            int Max = 1, Min = 1;
            for (int i = 1; i <= len; i++) {
                s[i] = str.charAt(i-1);
            }
            for(int i = 1; i <= len; i++){
                if(s[i] == 'I'){
                    Max ++;
                    Min = Max;
                    a[i] = Max;
                }
                else{ // = 'D'
                    a[i] = Min;
                    for(int j = i - 1; j >= 0; j--){
                        a[j]++;
                        Max = a[j];
                        if(s[j] == 'I') break;
                    }
                }
            }
            
            String res = "";
            for (int i = 0; i <= len; i++) {
                res += Integer.toString(a[i]);
            }
            System.out.println(res);
        }
    }
}
