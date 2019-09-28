package com.nabesh;

import java.util.Arrays;
import java.util.Scanner;

public class arrayReversal {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
        int arrItem = Integer.parseInt(arrItems[i]);
        arr[i] = arrItem;
        }

       scanner.close();
        for (int j = arr.length -1; j >= 0; j--) {
            arr[j] = arr[j];
            System.out.print(arr[j]+" ");
        }

    }
}
