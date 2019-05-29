package lesson7.cats;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public int getFood() {
        return food;
    }

    public void setFood(int foof) {
        this.food = foof;
    }

    public boolean descreaseFood(int amount) {

        if (food < amount){
            return false;
        } else {
            food -= amount;
            return true;
        }


    }

    public void addFood(int n) {
        food += n;
    }


}
