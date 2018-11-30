package Zadania_30.Animals;

public class Goldfish extends Fish {

    public Goldfish(String name){
        super.name = name;
    }

    @Override
    public String toString() {
        return "Goldfish{" +
                "name='" + name + '\'' +
                '}';
    }
}
