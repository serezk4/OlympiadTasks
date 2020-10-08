package com.serezka.tasks.func.task7;

/*
В одном шаге от счастья

* Условие: Вова купил билет в трамвае 13-го маршрута и сразу посчитал суммы первых трёх цифр и
последних трёх цифр номера билета (номер у билета шестизначный). Оказалось, что
суммы отличаются ровно на единицу. «Я в одном шаге от счастья», — подумал Вова, —
«или предыдущий или следующий билет точно счастливый». Прав ли он?
* Входные данные:в первой строке число K – количество тестов. В следующих K строках
записаны номера билетов. Количество тестов не больше 10. Номер состоит ровно из шести цифр,
среди которых могут быть и нули. Гарантируется, что Вова умеет считать, то есть суммы первых
трех цифр и последних трех цифр отличаются ровно на единицу.
* Выходные данные: K строк, в каждой из которых для соответствующего теста следует указать
"Yes", если Вова прав, и "No", если нет.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String[] lines = new String[count];
        for (int i = 0; i < count; i++)
            lines[i] = sc.next();

        for (String line : lines) {
            int inNum = Integer.parseInt(line);

            System.out.println(
                    (isLucky(inNum + 1) || isLucky(inNum - 1)
                            ? "Yes" : "No"));
        }


    }

    private static int digitsSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static boolean isLucky(int number) {
        int lhs = number / 1000;
        int rhs = number % 1000;
        return digitsSum(lhs) == digitsSum(rhs);
    }
}
