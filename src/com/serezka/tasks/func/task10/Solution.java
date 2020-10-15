package com.serezka.tasks.func.task10;

import java.util.Map.Entry;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        Entry<Integer, Integer> result = goldbah(a);
        System.out.println(Math.min(result.getKey(), result.getValue()) + " " + Math.max(result.getValue(), result.getKey()));

        
    }

    private static Entry<Integer, Integer> goldbah(int a) {
        int num1 = 1;
        int num2 = 1;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((num1 + num2) == a) {
                    int finalNum1 = num1;
                    int finalNum2 = num2;
                    return new Entry<Integer, Integer>() {
                        @Override
                        public Integer getKey() {
                            return finalNum1;
                        }

                        @Override
                        public Integer getValue() {
                            return finalNum2;
                        }

                        @Override
                        public Integer setValue(Integer value) {
                            return null;
                        }
                    };
                }
                if (checkSimple(i) && checkSimple(j)) {
                    num1 = i;
                    num2 = j;
                }
            }
        }

        return new Entry<Integer, Integer>() {
            @Override
            public Integer getKey() {
                return 1;
            }

            @Override
            public Integer getValue() {
                return 1;
            }

            @Override
            public Integer setValue(Integer value) {
                return null;
            }
        };
    }

    private static boolean checkSimple(int i) {
        if ((i <= 1))
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;

        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }

        return true;
    }
}
