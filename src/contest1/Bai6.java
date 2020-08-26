/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sonnt
 */
public class Bai6 {
    static int n;
    static ArrayList<Pair> arr;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            arr = new ArrayList<Pair>();
            n = in.nextInt();
            int a, b;
            
            
            
            for(int i = 0; i< n; i++) {
                Pair p = new Pair();
                p.start = in.nextInt();
                p.end = in.nextInt();
                arr.add(p);
            }
            Collections.sort(arr);
            
            int l = arr.size();
            int count = 1;
            int c = arr.get(0).end;
            for(int i = 1; i < l;i++) {
                if(arr.get(i).start>=c) {
                    count++;
                    c = arr.get(i).end;
                }
            }
            System.out.println(count);
            
        }
    }
}

class Pair implements Comparable{
        public int start;
        public int end;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public int compareTo(Object o) {
        Pair c = (Pair)o;

        return this.end - c.end;
    }

}
