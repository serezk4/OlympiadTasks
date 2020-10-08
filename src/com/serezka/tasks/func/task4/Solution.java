package com.serezka.tasks.func.task4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long result = 0;
        for (long i = 0; i < 3; i++)
            result += isPrime(sc.nextLong());

        System.out.printf("%d%n%s", result, (isPrime(result) > 0 ? "Yes" : "No"));
    }

    private static long isPrime(long n) {
        if (n < 2) return 0;

        for (long i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return 0;
        return n;
    }
}
