package com.serezka.tasks.func.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        System.out.println(volodya(a1, a2, a3));
    }

    private static List<String> volodya(int a1, int a2, int a3) {
        String a1str = String.valueOf(a1);
        String a2str = String.valueOf(a2);
        String a3str = String.valueOf(a3);

        int maxLen = Math.max(a1str.length(), Math.max(a2str.length(), a3str.length()));
        a1str = String.format("%0" + maxLen + "d", a1);
        a2str = String.format("%0" + maxLen + "d", a2);
        a3str = String.format("%0" + maxLen + "d", a3);

        System.out.println(volodya(a2str, String.valueOf(volodya(a1str, a3str))));
        System.out.println(volodya(a3str, String.valueOf(volodya(a2str, a1str))));
        System.out.println(volodya(a1str, String.valueOf(volodya(a2str, a3str))));

        return new ArrayList<>();
    }

    private static String volodya(String a, String b) {
        return volodya(a, b, "");
    }

    private static String volodya(String a, String b, String result) {
        if (a.length() <= 0)
            return result;

        int sumOfLastNums = Integer.parseInt(String.valueOf(a.charAt(a.length() - 1)))
                + Integer.parseInt(String.valueOf(b.charAt(b.length() - 1)));
        result += sumOfLastNums;

        a = a.substring(0, a.length() - 1);
        b = b.substring(0, b.length() - 1);

        return volodya(a, b, result);
    }

    private static int defaultCalculator(int a1, int a2, int a3) {
        return a1 + a2 + a3;
    }
}
