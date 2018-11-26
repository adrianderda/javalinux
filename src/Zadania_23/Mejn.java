package Zadania_23;

public class Mejn {
    public static void main(String[] args) {

        //Zadanie 1
        Dog dog1 = new Dog();
        dog1.breed = "Dachshund";
        dog1.age = 14;
        dog1.name = "Lucky";
        dog1.color = Color.GINGER;
        System.out.println(dog1.breed +", "+dog1.age+", "+dog1.name+", "+dog1.color);

        //Zadanie 2
        Dog dog2 = new Dog("Golden Retriver",6,"Puszek",Color.GOLDEN);

        //Zadanie 3
        dog2.allAbout();
        System.out.println(dog2.getAge());
        dog2.setAge(-1);

        //Zadanie 4
        Dog[] table ={dog1,dog2};
        for(Dog dogs : table){
            dogs.allAbout();
        }

        //Zadanie 6
        Lista lista = new Lista();
        lista.addElement(10);
        lista.addElement(20);
        lista.addElement(30);
        lista.addElement(50);
        lista.addElement(50);
        lista.addElement(6);
        lista.listStatus();
        System.out.println("--------------------------");
        lista.search(50);
        lista.removeDuplicates();
        lista.removeDuplicates();
        lista.listStatus();
    }
}
