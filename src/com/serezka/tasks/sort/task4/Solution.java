package com.serezka.tasks.sort.task4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Date> dates = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");

        for (int i = 0; i < n; i++)
            dates.add(sf.parse(sc.nextInt() + ":" + sc.nextInt() + ":" + sc.nextInt()));
        Collections.sort(dates);

        for (Date date : dates)
            System.out.println(new SimpleDateFormat("H m s").format(date));
    }
}
