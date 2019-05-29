package lesson7.cats;

public class Cat {

     private String name;
     private boolean catisfull;

    public Cat(String name) {

        this.name = name;
        catisfull = false;
    }

    public String getName() {
        return name;
    }

    public boolean eat(Plate plate){

        if (plate.descreaseFood(10)){
            System.out.println(name + " eat...");
            catisfull = true;
            return true;
        } else {
            System.out.println(name + " not eat...");
            return false;
        }



    }

    public void fear(Dog dog){
        System.out.println(name + " fear " + dog.getName());
    }
}
