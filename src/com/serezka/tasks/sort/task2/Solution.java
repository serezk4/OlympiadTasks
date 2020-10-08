package com.serezka.tasks.sort.task2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        for (int i = arr.length - 1; i >= 0; --i) {
            int pos = 0;
            int max = arr[0];

            for (int j = 1; j <= i; ++j)
                if (max < arr[j]) {
                    pos = j;
                    max = arr[j];
                }

            System.out.println(pos);
            int buff = arr[pos];
            arr[pos] = arr[i];
            arr[i] = buff;
        }
    }
}
