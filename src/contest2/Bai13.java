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
public class Bai13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String str = in.nextLine();
            str = str.trim();
            boolean check = true;
            int len = str.length();
            Stack<Character> st = new Stack();
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == ')') {
                    Stack<Character> temp = new Stack();
                    while (st.peek() != '(') {
                        temp.push(st.pop());
                    }
                    if (temp.size() <= 1) {
                        check = false;
                        break;
                    } else {
                        st.pop();
                        st.push('t'); // them bua 1 ky tu vao
                    }
                } else {
                    st.push(str.charAt(i));
                }
            }

            if (check) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
