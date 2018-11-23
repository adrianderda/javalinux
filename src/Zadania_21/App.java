package Zadania_21;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Zadanie 1
        System.out.println("Podaj swoja liczbe:");
        int number = sc.nextInt();
        if ((number % 2) == 0) {
            System.out.println("Twoja liczba jest parzysta");
        } else {
            System.out.println("Twoja liczba jest nieparzysta");
        }

        //Zadanie 2
        switch (number % 2) {
            case 0:
                System.out.println("Twoja liczba jest parzysta");
                break;

            default:
                System.out.println("Twoja liczba jest nieparzysta");
                break;
        }

        //Zadanie 3
        Random random = new Random();
        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt();
        }
        for (int numbers : table) {
            System.out.println(numbers);
        }

        //Zadanie 4
        int a;
        int sum1 = 0;
        do {
            System.out.println("Podaj swoja liczbe");
            a = sc.nextInt();
            sum1 += a;
        } while (a != 0);
        System.out.println("Suma wprowadzonych liczb to: " + sum1);

        //Zadanie 4*
        List<Integer> array = new ArrayList<>();
        int x;
        int sum = 0;
        do {
            System.out.println("Podaj swoja liczbe");
            x = sc.nextInt();
            array.add(x);
        }
        while (x != 0);

        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Suma wprowadzonych liczb to: " + sum);

        //Zadanie 5
        System.out.println("Podaj swoja liczbe");
        int i = sc.nextInt();
        if ((i >= 1) && (i <= 10)) {
            System.out.println("Twoja liczba jest z zakresu 1-10");
        }

        //Zadanie 6
        do {
            System.out.println("Podaj swoja liczbe");
            x = sc.nextInt();
        }
        while ((x != 0) && (x != 5));

        //Zadanie 7
        System.out.println("Podaj liczbe");
        int n = sc.nextInt();
        while ((n % 2) == 0) {
            System.out.println("Twoja liczba jest parzysta");
            break;
        }

    }
}


