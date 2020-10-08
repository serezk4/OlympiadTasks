package com.serezka.tasks.func.task2;

/*
Подсчет букв

* Условие: дано три символа. Требуется определить, сколько из них являются буквами английского алфавита (в любом регистре).
* Входные данные: содержит три символа, разделенные пробелом. Гарантируется, что ASCII-коды символов превышают 32.
* Выходные данные: выведите ответ на задачу.
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        for (int i = 0; i < 3; i++)
            result += isLetter(sc.next());

        System.out.println(result);
    }

    private static int isLetter(String val) {
        return val.matches("[a-zA-Z]") ? 1 : 0;
    }
}
