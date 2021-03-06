package com.learn.DSA;

import java.util.Scanner;

public class DeletingLastArrayElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[50];
        System.out.println("Enter Size of Array:");
        int size = scan.nextInt();
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("The array elements you entered are:");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        size--;
        System.out.println("After deleting from last position:");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}
