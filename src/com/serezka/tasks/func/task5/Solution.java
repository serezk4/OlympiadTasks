package com.serezka.tasks.func.task5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point a = new Point(sc.nextDouble(), sc.nextDouble());
        Point b = new Point(sc.nextDouble(), sc.nextDouble());
        Point c = new Point(sc.nextDouble(), sc.nextDouble());

        double s1 = side(a, b);
        double s2 = side(a, c);
        double s3 = side(b, c);

        System.out.println((s1 + s2 == s3 || s1 + s3 == s2 || s2 + s3 == s1) ? "Yes" : "No");
    }

    private static double sqr(double x) {
        return x * x;
    }

    private static double side(Point a, Point b) {
        return sqr(a.getX() - b.getX()) + sqr(a.getY() - b.getY());
    }

    private static class Point {
        private final double x;
        private final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
}
