package Zadania_30;

import Zadania_30.Animals.Animal;
import Zadania_30.Animals.Goldfish;
import Zadania_30.Animals.Human;

public class App {
    public static void main(String[] args) {


        Student student = new ClassStudent();
        student.setName("asf");

        Animal human = new Human("Czowiek");
        Animal fish = new Goldfish("Zlota Rybka");

        human.setName("Patryk");


        System.out.println(human);
        System.out.println(fish);



    }
}
