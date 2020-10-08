package com.serezka.tasks.func.task8;

import java.util.Scanner;

/**
 * get(i) – извлечение элемента с номером i;
 * update(l,r,x) – присвоение значения x всем элементам подмассива a[l..r];
 * add(l,r,x) – увеличение всех элементов a[l..r] на x;
 * rsq(l,r) – вычисление суммы всех элементов a[l..r], т.е. значения a[l]+a[l+1]+…+a[r];
 * rmq(l,r) – вычисление минимального элемента среди всех значений a[l..r].
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[sc.nextInt() + 1];
        for (int i = 1; i < numbers.length; i++)
            numbers[i] = sc.nextInt();

        FuncArray array = new FuncArray(numbers);
        StringBuilder answer = new StringBuilder();

        int operationsCount = sc.nextInt();
        for (int i = 0; i < operationsCount; i++) {
            String operation = sc.next();

            switch (operation) {
                case "get":
                    answer.append(array.get(sc.nextInt())).append("\n");
                    break;
                case "update":
                    array.update(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case "add":
                    array.add(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case "rsq":
                    answer.append(array.rsq(sc.nextInt(), sc.nextInt())).append("\n");
                    break;
                case "rmq":
                    answer.append(array.rmq(sc.nextInt(), sc.nextInt())).append("\n");
                    break;
                default:
                    answer.append("Unknown operation!").append("\n");
                    break;
            }
        }

        System.out.println(answer.toString());
    }

    private static class FuncArray {
        private final int[] numbers;

        public FuncArray(int[] numbers) {
            this.numbers = numbers;
        }

        public int get(int i) {
            return numbers[i];
        }

        public void update(int l, int r, int x) {
            for (int i = l; i <= r; i++)
                numbers[i] = x;
        }

        public void add(int l, int r, int x) {
            for (int i = l; i <= r; i++)
                numbers[i] += x;
        }

        public int rsq(int l, int r) {
            int sum = 0;
            for (int i = l; i <= r; i++)
                sum += numbers[i];
            return sum;
        }

        public int rmq(int l, int r) {
            int min = numbers[l];
            for (int i = l; i <= r; i++)
                min = Math.min(numbers[i], min);
            return min;
        }
    }
}
