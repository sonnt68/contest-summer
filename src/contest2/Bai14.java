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
public class Bai14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String str = in.nextLine();
            int res = 0;
            str= str.trim();
            int len = str.length();
            Stack <Character> st = new Stack();
            for (int i = 0; i < len; i++) {
                if(str.charAt(i) == '('){
                    st.push(str.charAt(i));
                }
                else{
                    if(st.empty()){
                        st.push('(');
                        res++;
                    }
                    else{
                        st.pop();
                    }
                }
            }
            int temp = st.size();
            res += temp/2;
            System.out.println(res);
        }
    }
}
