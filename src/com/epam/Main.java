package com.epam;

import java.util.Scanner;

/**
 * Created by Любовь on 11.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        MyDayOfWeek m = MyDayOfWeek.valueOf(str);

        System.out.println("The next day of week: " + m.nextDay());
    }
}
