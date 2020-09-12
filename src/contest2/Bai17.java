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
public class Bai17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        in.nextLine();
        while(tc-- > 0){
            String str = in.nextLine();
            str = str.trim();
            Stack <String> st = new Stack();
            int len = str.length();
            for (int i = 0; i < len; i++) {
                if(str.charAt(i) == '+'){
                    String num1 = st.pop();
                    String num2 = st.pop();
                    String kq = "(" + num2 + "+" + num1 + ")";
                    st.push(kq);
                }
                else if(str.charAt(i) == '-'){
                    String num1 = st.pop();
                    String num2 = st.pop();
                    String kq = "(" + num2 + "-" + num1 + ")";
                    st.push(kq);
                }
                else if(str.charAt(i) == '*'){
                    String num1 = st.pop();
                    String num2 = st.pop();
                    String kq = "(" + num2 + "*" + num1 + ")";
                    st.push(kq);
                }
                else if(str.charAt(i) == '/'){
                    String num1 = st.pop();
                    String num2 = st.pop();
                    String kq = "(" + num2 + "/" + num1 + ")";
                    st.push(kq);
                }
                else if(str.charAt(i) == '^'){
                    String num1 = st.pop();
                    String num2 = st.pop();
                    String kq = "(" + num2 + "^" + num1 + ")";
                    st.push(kq);
                }
                else{
                    String num = Character.toString(str.charAt(i));
                    st.push(num);
                }
            }
            System.out.println(st.peek());
        }
    }
}
