package com.learn.DSA;

import java.util.Scanner;

public class DeletionInSortedArrayAtAnyGivenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[50];
        System.out.println("Enter Size of Array:");
        int size = scan.nextInt();
        System.out.println("Enter Array Elements");
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("The array elements you entered are:");
        for (int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the position at which you want to delete the array element:");
        int pos = scan.nextInt();
        for(int i =pos-1;i<size;i++)
        {
            a[i]=a[i+1];
        }
        size--;
        System.out.println("Your new Array is:");
        for (int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
}
