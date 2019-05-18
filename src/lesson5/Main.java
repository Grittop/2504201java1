package lesson5;

public class Main {



    public static void main(String[] args) {

        Sotrudnik sotrudnik = new Sotrudnik("Иванов Иван Иванович", "директор", "aaa@aaa.ru", "899988899", 100000, 45);

        sotrudnik.info();
        System.out.println();
        System.out.println();
        Sotrudnik[] personArray = new Sotrudnik[5];

        personArray[0] = new Sotrudnik("Петров Петр Петрович", "завхоз", "bbb@bbbb.ru", "897767757", 50000, 40);
        personArray[1] = new Sotrudnik("Васильев Василий Васильевич", "экономист", "ccc@bbbb.ru", "897767487", 40000, 45);
        personArray[2] = new Sotrudnik("Сноу Джон Иванович", "охранник", "ddd@bbbb.ru", "866666666", 20000, 33);
        personArray[3] = new Sotrudnik("Бузова Ольга Петровна", "секретарь", "zzz@bbbb.ru", "89745553", 35000, 23);
        personArray[4] = new Sotrudnik("Боярский Михаил Иваныч", "водитель", "vvv@bbbb.ru", "89700000", 15000, 70);

        for (int i = 0; i < 5; i++) {

            personArray[i].info40();
        }


        }

    }

