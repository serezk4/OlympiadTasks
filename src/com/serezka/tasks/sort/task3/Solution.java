package com.serezka.tasks.sort.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int stickman = 0;
        int player = 0;
        for (int i = 0; i < ((arr.length) / 2); i++)
            stickman += arr[i];
        for (int i = ((arr.length) / 2); i < arr.length; i++)
            player += arr[i];

        System.out.println(player - stickman);
    }
}
