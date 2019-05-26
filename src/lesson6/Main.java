package lesson6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Tuzik");


        dog.info();
        cat.info();
        System.out.println();

        cat.run(200);
        dog.run(400);

        cat.jump(1);
        dog.jump(1);

        cat.swim(5);
        dog.swim(9);


    }
}
