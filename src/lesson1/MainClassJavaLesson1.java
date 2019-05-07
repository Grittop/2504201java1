package lesson1;

import java.util.Scanner;

public class MainClassJavaLesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//   Задание 2
        int a,b,c,d;
        byte by;
        long lo;
        float fl;
        double db;
        char ch;
        boolean bl;

//   Задание 3

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a:");
        a = scanner.nextInt();
        System.out.println("Введите число b:");
        b = scanner.nextInt();
        System.out.println("Введите число c:");
        c = scanner.nextInt();
        System.out.println("Введите число d:");
        d = scanner.nextInt();
        int result;

        result = a * (b + (c / d));


        System.out.println("result = " + (result));

//    Задание 4

        int e;
        int f;

        System.out.println("Введите число e:");
        e = scanner.nextInt();
        System.out.println("Введите число f:");
        f = scanner.nextInt();

        if((e+f)>=10 && (e+f)<=20) {
            bl = true;
            System.out.println(bl);
        }
        else {
            bl = false;
            System.out.println(bl);
        }

//   Задание 5

        int g;
        System.out.println("Введите число g:");
        g = scanner.nextInt();
        if (g>=0) {
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }

//   Задание 6

        int k;
        System.out.println("Введите число k:");
        k = scanner.nextInt();
        if (k<0) {
            bl = true;
            System.out.println(bl);
        }

//    Задание 7

        String name;
        System.out.println("Введите число ИМЯ:");
        name = scanner.next();
        System.out.println("Привет, " + name + "!");

//   Задание 8

        int gg;
        int god;


        System.out.println("Введите год:");
        god = scanner.nextInt();
        gg = god - 1600;


        if ((gg % 400) == 0) {
            System.out.println("Год високостный");
        } else

            if ((gg % 100) == 0) {
            System.out.println("Год не високостный");
        } else

            if ((gg % 4) == 0) {
            System.out.println("Год високостный");
        } else

            if (god > 1600){
            System.out.println("Год не високостный");
        }


    }
}
