package com.learn.DSA;

import java.util.Scanner;

public class ArrayTraversing {

    public static void main(String[] args) {
        int[] a = new int[10];//Declaring Array with name a and size 10
        Scanner scan = new Scanner(System.in);//scanner
        System.out.println("Enter Array Elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i] = scan.nextInt(); //populating the array
        }
        System.out.println("The elements you entered are:");
        for(int i=0;i< a.length;i++)
        {
            System.out.println(a[i]); //printing array elements
        }
    }
}
