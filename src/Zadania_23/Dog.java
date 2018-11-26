package Zadania_23;

public class Dog {

    String breed;
    int age;
    String name;
    Color color;

    public Dog() {
    }

    public Dog(String breed, int age, String name, Color color) {
        this.breed = breed;
        this.age = age;
        this.name = name;
        this.color = color;
    }
    public void allAbout(){
        System.out.println(breed +", "+age+", "+name+", "+color);
    }

    public int getAge() {
        return age;
    }

    //Zadanie 5
    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        }
    }
}
