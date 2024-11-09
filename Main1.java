package ru.iteco.util;

import java.util.*;

public class Main1 {

    /**
     * @author Yan Krivov
     * @param args
     *
     * javac Main1.java -> компилиться Main1.class
     */

    public static void main(String[] args) {
        System.out.println("JAVA!");
        System.out.println(args[0] + " | " + args[1]);


        //внутри метода нельзя присваивать модификатор доступа (public, private...)
        int age = 23;
        System.out.println(age);

        boolean flag = true;
        byte byteVar = 98;
        long longVar = 123456777777L;

        float floatVar = 12346.46445F;
        float floatVar1 = (float)12346.46445;

        char charVar = (char) byteVar;

        System.out.println(charVar);

        String name = "ALice";
        System.out.println(name);

        String nameMe = "Max";
        float percent = 14.2894F;
        System.out.print("Max - " + age);
        System.out.println("World");
        // %s, %d, %f
        System.out.printf("%s - %d | %f",nameMe, age, percent);

        System.out.println("\"H\ne\tll\bo\"");

        int firstVar = 101;
        int secondVar = 0b1011;
        int octalVar = 0746;
        int var_16 = 0x4d;

        System.out.println((char) var_16);

        //константа (final)
        final int INDEX = 1_21_21__2_1;
        System.out.println(INDEX);

        int year = 23;
        int age2 = year++;
        int age3 = -year;
        //(Инкремент)++var | var++ | --var | var-- (декримент)
        System.out.println(++year);
        System.out.println(year++);
        System.out.println(year);
        System.out.println(age2);
        System.out.println(age3);

        int num = 20;
        System.out.println(num > 18 ? "yes" : " no");

        Scanner scr = new Scanner(System.in);

        String line = scr.next();
        System.out.println(line);

        scr.close();

    }
}