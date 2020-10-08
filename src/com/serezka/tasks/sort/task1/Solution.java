package com.serezka.tasks.sort.task1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[sc.nextInt()];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }

        boolean isSorted = false;
        int buf;
        int c = 0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;

                    c++;
                }
            }
        }
        System.out.println(c);
    }
}