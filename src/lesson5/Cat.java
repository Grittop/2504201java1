package lesson5;

public class Cat {

    String name;
    String color;
    int age;

    public void info(){
        System.out.println("Cat: "+ name +" " + color + " " + age);
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void jump(){
        System.out.println("Cat "+ name + " Jump");
    }


}
