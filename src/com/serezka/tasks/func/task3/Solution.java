package com.serezka.tasks.func.task3;

/*
Число сочетаний

* Условие: Факториал числа n – произведение всех натуральных чисел от 1 до n. Сочетанием из n по k называют
набор из k элементов, выбранных из данного множества, содержащего n различных элементов.
При этом наборы, отличающиеся только порядком следования элементов, считаются одинаковыми. По заданным
целым числам n и k требуется вычислить число сочетаний.
* Входные данные: целые числа n и k (0 ≤ k ≤ n ≤ 20)
* Выходные данные: число сочетаний из n по k
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a1 = sc.nextLong();
        long a2 = sc.nextLong();

        System.out.println(factorial(a1) / factorial(a2) / factorial(a1 - a2));
    }

    private static long factorial(long n) {
        long result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return  result;
    }
}
