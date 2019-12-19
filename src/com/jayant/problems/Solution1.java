package com.jayant.problems;

import java.util.Scanner;

class Solution1{

    static int[] reverseArray(int[] a) {
        int len = a.length;
        int[] res = new int[len];

        for(int i = 0; i < a.length; i++){
            //--len;
            res[i] = a[--len];
        }
        return res;

    }

    public static void main(String[]args){
        int[] a = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.print("Enter the number: ");
            a[i] = sc.nextInt();
        }
        int[] res = reverseArray(a);

        for(int a1: res){
            System.out.println(a1);
        }

    }


}

