package com.learn.DSA;

import java.util.Scanner;

public class InsertionAtGivenPositionInSortedArray {
    public static void main(String[] args) {
        int size=5;
        int[] a = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for(int i=0;i<size;i++) {
            a[i] = scan.nextInt(); //populating the array
        }
        System.out.println("The elements you entered are:");
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]); //printing array elements
        }
        System.out.println("Enter the number you want to insert");
        int num = scan.nextInt();
        System.out.println("Enter the position at which you want to insert the Element");
        int pos = scan.nextInt();
        for(int i=size-1;i>=pos-1;i--)
        {
            a[i+1]=a[i]; //shifting by position of 1
        }
        a[pos-1]=num;
        size++;
        System.out.println("Your new Array is");
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]); //printing array elements
        }
    }
}
