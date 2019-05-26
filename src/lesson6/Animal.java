package lesson6;

public class Animal {

    String name;

    int maxRun;
    double maxJump;
    double maxSwim;


    public Animal() {

    }

    public Animal(String name, int maxRun, double maxJump, double maxSwim) {
        this.name = name;

        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public Animal(String name) {
        this.name = name;
    }

//    public Animal(String name, String color, int age ) {
//        this.name = name;
//        this.color = color;
//        this.age = age;
//    }

    public void run(int distance) {

        if (distance <= maxRun){
            System.out.println(name + " run " + distance + " м");
        } else {
            System.out.println(name + " не добежит");
        }

    }

    public void jump(double height) {

        if (height <= maxJump){
            System.out.println(name + " jump " + height + " м");
        }else {
            System.out.println(name + " не допрыгнет");
        }

    }



    public void swim(double interval) {

        if (maxSwim == 0) {
            System.out.println(name + " не умеет плавать");
            return;
        }

        if (interval <= maxSwim){
            System.out.println(name + " swim " + interval + " м");
        } else {
            System.out.println(name + " не доплывет");
        }
    }

    public void info() {
        System.out.println(name);
    }

    // Переопределение toString (вывод (dog))
//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
