package lesson4;

import java.util.Random;
import java.util.Scanner;

public class XOGame {

    static final int SIZE =  3;
//    static final int DOTS_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true){

            humanTern();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("Вы победили :-)");
                break;
            }

            if (isFull()){
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)){
                System.out.println("Вы проиграли :-(");
                break;
            }

            if (isFull()){
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static void initMap(){

        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EPTY;


            }

        }
    }

    public static void printMap(){

        System.out.print("  ");

        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {

            System.out.print(i + 1 + " ");

            for (int j = 0; j < SIZE; j++) {

                System.out.print(map[i][j] + " ");

            }

            System.out.println();

        }


    }

    public static void humanTern(){
        int x,y;
        do {
            System.out.println("input koord X Y");

            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;

        }while (!isCellValid(y,x));
        map[y][x] = DOT_X;

    }

    public static boolean isCellValid(int y, int x){

        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE){
            return false;
        }
        return (map[y][x] == DOT_EPTY);

//        if (map[y][x] == DOT_EPTY){
//            return true;
//        }else {
//            return false;
//        }
    }

    public static void aiTurn(){
        int x,y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        }while (!isCellValid(y,x));
        map[y][x] = DOT_O;

    }

    public static boolean isFull() {

        int k = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EPTY){

                    k++;
                }
            }

        }
        return k == 0;
    }

    public static boolean checkWin(char symbol){

        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;

        return false;
    }
}
