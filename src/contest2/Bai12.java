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
public class Bai12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            System.out.println(find(n));
        }
    }

    static long find(String n) {
        long ans = 0;
        Queue q = new LinkedList();
        q.add("1");
        while (be((String) q.peek(), n)) {
            String front = (String) q.poll();
            q.add(front + "0");
            q.add(front + "1");
            ans++;
        }
        return ans;
    }

    static boolean be(String n, String c) {
        if (n.length() == c.length()) {
            for (int i = 0, sz = n.length(); i < sz; i++) {
                if (c.charAt(i) == n.charAt(i)) {
                    continue;
                } else {
                    if (c.charAt(i) > n.charAt(i)) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        } else {
            if (n.length() > c.length()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
