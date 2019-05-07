package lesson2;

public class MainClassLesson2 {
    public static void main(String[] args) {

//        Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]

        int[] massive = new int[10];
        massive[0] = 1;
        massive[1] = 1;
        massive[2] = 0;
        massive[3] = 0;
        massive[4] = 1;
        massive[5] = 0;
        massive[6] = 1;
        massive[7] = 1;
        massive[8] = 0;
        massive[9] = 0;


        int maxmassive = massive.length;

        for(int i = 0; i < maxmassive; i++){
            System.out.print (massive[i]+" ");

        }
//        С помощью цикла и условия заменить 0 на 1, 1 на 0

        for(int i = 0; i < maxmassive; i++) {
            if (massive[i] == 1) {
                massive[i] = 0;
            } else massive[i] = 1;
        }
        System.out.println();

        for(int i = 0; i < maxmassive; i++) {

            System.out.print(massive[i] + " ");
        }

//        Задать пустой целочисленный массив размером 8
//        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21

        int[] massive2 = new int[8];
        int j = 0;
        int maxMass2 = massive2.length;
        for(int i = 0; i < maxMass2; i++, j = j+3){
        massive2[i] = j;
        }
        System.out.println();

        for(j = 0; j < maxMass2; j++) {

            System.out.print(massive2[j] + " ");}

//        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2


//        int[] massive3 = new int[12];
        int[] massive3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println();
        int maxMass3 = massive3.length;

        for (int i = 0; i < maxMass3; i++){
            if (massive3[i] < 6){
                massive3[i] = massive3[i] * 2;
            }
        }

        for(int i = 0; i < maxMass3; i++) {

            System.out.print(massive3[i] + " ");}

//        Создать квадратный двумерный целочисленный массив
//        (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] table = new int[4][4];

//        int counter = 1;

        System.out.println();
        System.out.println();


        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {

                if((a+b == 3) || (a==b)){
                    table[a][b] = 1;
                }
//                table[a][b] = counter;
                System.out.print(table[a][b] + " ");
//                counter++;
            }
            System.out.println();
        }

//  Задать одномерный массив и найти в нем минимальный и максимальный
//      элементы (без помощи интернета)

        int[] massive4 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println();
        int maxMass4 = massive4.length;
        int min = massive4[0];
        int max = massive4[0];

        for (int i = 0; i < maxMass4; i++){

            if (massive4[i] < min){
                min = massive4[i];
            }
        }

        for (int i = 0; i < maxMass4; i++){

            if (massive4[i] > max){
                max = massive4[i];
            }
        }


        System.out.println();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);




        }

//        Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//        если в массиве есть место, в котором сумма левой и правой части массива равны.



    private static boolean checkBalance(int[] massive5) {

        int[] massive5 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        int first, end;
        first = 0;
        end = 0;

        for (int i = 0; i < massive5.length + 1; i++) {


            for (int d = 0; d < i; d++) {
                first += massive5[d];
            }

            for (int d = i; d < massive5.length; d++) {
                end = end + massive5[d];
            }

            if (first == end) return true;
        }
        return false;
    }

//    Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//    при этом метод должен сместить все элементымассива на n позиций.

    private static void metodSdvig(int[] massive6, int n) {

        if (n > 0) {
            for (int e = 0; e < n; e++) {


                if (massive6.length - n >= 0) {
                    int j = e + n;
                    massive6[e] = massive6[j];
                }



            }
        }


        }



    }


}

