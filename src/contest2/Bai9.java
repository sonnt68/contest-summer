/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sonnt
 */
public class Bai9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            System.out.println(check(s) ? "YES" : "NO");

        }
    }

    static boolean check(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                st.push(c);
            } else {

                switch (c) {
                    case ']':
                        if (!st.empty() && st.peek() == '[') {
                            st.pop();
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if (!st.empty() && st.peek() == '{') {
                            st.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ')':
                        if (!st.empty() && st.peek() == '(') {
                            st.pop();
                        } else {
                            return false;
                        }
                        break;
                }
            }
        }
        if (!st.empty()) {
            return false;
        }
        return true;

    }
}
