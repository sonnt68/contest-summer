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
public class Bai18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        in.nextLine();
        while(tc-- > 0){
            String str = in.nextLine();
            str = str.trim();
            Stack <Integer> st = new Stack();
            int len = str.length();
            for (int i = 0; i < len; i++) {
                if(str.charAt(i) == '+'){
                    int num1 = st.pop();
                    int num2 = st.pop();
                    int kq = num1+num2;
                    st.push(kq);
                }
                else if(str.charAt(i) == '-'){
                    int num1 = st.pop();
                    int num2 = st.pop();
                    int kq = num2-num1;
                    st.push(kq);
                }
                else if(str.charAt(i) == '*'){
                    int num1 = st.pop();
                    int num2 = st.pop();
                    int kq = num1*num2;
                    st.push(kq);
                }
                else if(str.charAt(i) == '/'){
                    int num1 = st.pop();
                    int num2 = st.pop();
                    int kq = num2/num1;
                    st.push(kq);
                }
                else if(str.charAt(i) == '^'){
                    int num1 = st.pop();
                    int num2 = st.pop();
                    int kq = (int) Math.pow(num2, num1);
                    st.push(kq);
                }
                else{
                    int num = str.charAt(i) - '0';
                    st.push(num);
                }
            }
            System.out.println(st.peek());
        }
    }
}
