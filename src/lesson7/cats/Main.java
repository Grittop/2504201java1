package lesson7.cats;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Murzik");
        Plate plate = new Plate(27);
        System.out.println(plate);


//        cat.eat(plate);

        Cat[] cats = {new Cat("Murzik"),
                new Cat("Ruzzik"),
                new Cat("Suzzi")
        };

        for (Cat c: cats) {

            // проверка, смогла ли она поесть
            if (!c.eat(plate)){
                plate.addFood(30);
                System.out.println(plate);

                // еще раз накормить кошку
                c.eat(plate);
            }
        }

        System.out.println(plate);

        Dog dog = new Dog("Tuzik");
        dog.voice(cat);
    }
}
