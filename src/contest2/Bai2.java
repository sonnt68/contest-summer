/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;

/**
 *
 * @author sonnt
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        SelectionSort(a, n);
    }
    
    public static void SelectionSort(int a[],int n) {
        for(int i=0;i<n-1;i++) {
            int min=i;
            for(int j=i+1;j<n;j++) {
                if(a[j]<a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            System.out.print("Buoc "+(i+1)+": ");
            for(int j=0;j<n;j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }

    }
}
