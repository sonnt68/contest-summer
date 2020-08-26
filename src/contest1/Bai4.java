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
public class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = Integer.parseInt(in.nextLine());
        while(t-- > 0){
            String n = in.nextLine();
            System.out.println(chuanHoa(n));
        }
    }
    public static String chuanHoa(String n) {
        String str = n.trim();
        str = str.toLowerCase();
        str = str.replaceAll("\\s+", " ");
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i < temp.length - 1){
                str += " ";
            }
        }
        return str;
    }
}
