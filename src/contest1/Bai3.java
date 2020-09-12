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
public class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = Integer.parseInt(in.nextLine());
        while(t-- > 0){
            String n = in.nextLine();
            System.out.println(checkString(n));
        }
    }
    public static String checkString(String n) {
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i) % 2 != 0){
                return "NO";
            }
        }
        if(!isThuanNghich(n)){
            return "NO";
        }
        return "YES";
    }
    public static boolean isThuanNghich(String n){
        int length = n.length()-1;
        for (int i = 0; i < length/2; i++) {
            if(n.charAt(i) != n.charAt(length-i)){
                return false;
            }
        }
        return true;
    }
}
