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
public class Bai15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        in.nextLine();
        while (tc-- > 0) {
            String str = in.nextLine();
            str = str.trim();
            int len = str.length();
            Stack<Character> st = new Stack();
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == ')') {
                    Stack<Character> temp = new Stack();
                    while (true) {
                        Character ch = st.pop();
                        if (ch == '(') {
                            break;
                        } else {
                            temp.push(ch);
                        }
                    }
                    if (st.empty()) {
                        while (!temp.empty()) {
                            st.push(temp.pop());
                        }
                    } else {
                        if (st.peek() == '-') {
                            while (!temp.empty()) {
                                Character ch = temp.pop();
                                if(ch == '-'){
                                    st.push('+');
                                }
                                else if(ch == '+'){
                                    st.push('-');
                                }
                                else{
                                    st.push(ch);
                                }
                            }
                        } else {
                            while (!temp.empty()) {
                                st.push(temp.pop());
                            }
                        }
                    }

                } else {
                    st.push(str.charAt(i));
                }
            }
            
            String res = "";
            Stack <Character> sres = new Stack();
            while(!st.empty()){
                sres.push(st.pop());
            }
            while(!sres.empty()){
                res += sres.pop();
            }
            System.out.println(res);
        }
    }
}
