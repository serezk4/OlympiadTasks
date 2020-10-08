package com.serezka.tasks.func.task1;

/*
Количество цифр

* Условие: Дано три символа. Требуется определить, сколько из них являются цифрами.
* Входные данные: три символа, разделенные пробелом. Гарантируется, что ASCII-коды символов превышают 32.
* Выходные данные: выведите ответ на задачу.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        for (int i = 0; i < 3; i++)
            result += isDigit(sc.next());

        System.out.println(result);
    }

    private static int isDigit(String val) {
        return val.matches("[1234567890]") ? 1 : 0;
    }
}
