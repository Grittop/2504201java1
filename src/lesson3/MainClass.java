package lesson3;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();


    public static void main(String[] args) {


//        int y = rand.nextInt();
//        System.out.println(y);
//
//
//            int x = sc.nextInt();
////        int y = sc.nextInt();
//
//
//            if (x == y){
//                System.out.println("Вы выиграли!");
//            }else {
//                if (x < y){
//                    System.out.println("Число больше");
//                }else {
//                    System.out.println("Число меньше");
//                }
//            }


        myPlayStart(10);


        equalsString("", "");

    }

    public static void myPlayStart(int n) {

        int y = rand.nextInt(n);
        System.out.println("Введите число:");
        int x = -1;

        for (int i = 0; i < 3; i++) {


            x = sc.nextInt(n);


            if (x == y) {
                System.out.println("Вы выиграли!");
                break;
            } else {
                if (x < y) {
                    System.out.println("Число больше");
                } else {
                    System.out.println("Число меньше");
                }
            }

        }
    }



    public static String equalsString(String s1, String s2) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int y = rand.nextInt(10);

        s1 = words[y];


        int i;

        for (i = 0; i < 2; i++) {
            System.out.print(s1.charAt(i));

        }

        for (int j = i; j < 15; j++) {
            System.out.print("*");
        }


        System.out.println();

        System.out.println("Угадайте слово:");

        s2 = sc.next();



        while (!s1.equals(s2)){

            s2 = sc.next();



        }

        System.out.println("Наконец-то!");
        return s1;
    }
}





