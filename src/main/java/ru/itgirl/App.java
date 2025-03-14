package ru.itgirl;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println(today());
    }

    public static String today() {
        System.out.println("Enter the day of the week");
        StringBuilder sb = new StringBuilder();
        return sb.append("Сегодня ")
                .append(DayOfWeek.valueOf(new Scanner(System.in).nextLine().toUpperCase()))
                .append("!")
                .toString();
    }
}
