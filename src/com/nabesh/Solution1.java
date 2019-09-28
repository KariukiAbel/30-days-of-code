package com.nabesh;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [] even = new char[];
        String []s = new String[n];
        for (int i = 0; i < n; i++) {
            s [i]= sc.next();
        }
        sc.close();
        for (int j=0; j<s.length; j++){
            String word = s[j];
            char [] ch = word.toCharArray();
            for (int k = 0; k < ch.length; k++) {
                if (k % 2 == 0){
                    System.out.print(ch[k] );
                    even[k] = ch[k];
                }
                else {
                    System.out.print(" "+ch[k] );
                }
            }
        }
    }
}
