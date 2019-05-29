package lesson7;

public class Box {

    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        return this.color.equals(((Box) obj).color) && this.size == ((Box)obj).size;

    }

//Если equals говорит true, то hashCode обязательно тоже должен быть true (правила)

    @Override
    public int hashCode() {
        return color.hashCode() * 31 + size * 97;
    }
}
