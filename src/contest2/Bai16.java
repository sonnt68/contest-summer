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
public class Bai16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        in.nextLine();
        while (tc-- > 0) {
            String str = in.nextLine();
            //System.out.println(str);
            str.trim();
            Stack<String> st1 = new Stack();
            Stack<String> st2 = new Stack();
            int len = str.length();
            for (int i = 0; i < len; i++) {
                st1.push(Character.toString(str.charAt(i)));
            }

            while (!st1.empty()) {
                String s = st1.pop();
                //System.out.println(s);
                if (s.compareTo("+") == 0 || s.compareTo("-") == 0 || s.compareTo("*") == 0 
			|| s.compareTo("/") == 0 || s.compareTo("^") == 0) {
                    String s1 = st2.pop();
                    String s2 = st2.pop();
                    s = s1 + s2 + s;
                    st2.push(s);
                } else {
                    st2.push(s);
                }
            }

            String res = st2.pop();
            System.out.println(res);
        }
    }
}
