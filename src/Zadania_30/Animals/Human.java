package Zadania_30.Animals;

public class Human extends Mammal {


    public Human(String name){
        super.name=name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
