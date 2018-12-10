package Zadania_05;

public class Java5 {

    public static int task2(double x) {
        int temp = 0;
        int var = (int) x;
        if ((x % var) >= 0.5) {
            temp = (int) (x + 1);
        } else {
            return (int) x;
        }

        return temp;
    }

    public static int task3(int x, int y) {
        int temp = -1;
        try {
            temp = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez 0!!!");
        }
        return temp;
    }


    public static void main(String[] args) throws DivideByZeroExeption {

        //Zadanie 1
        int in = 5;
        char var = (char) in;
        char a = 5;
        int b = a;

        //Zadanie 2
        System.out.println(Java5.task2(3.1));

        //Zadanie 3
        System.out.println(Java5.task3(10, 0));

        //Zadanie 4
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(10, 0));
        System.out.println(calculator.divide(10, 5));
    }
}
