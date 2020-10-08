package com.serezka.tasks.func.task6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(findS(
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble()
        ) / 2);
    }

    private static double findS(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x2 - x1) * (y3 - y1) - ((x3 - x1) * (y2 - y1)));
    }
}
