package Zadania_05;

public interface Calculate {
    double add(double x, double y);

    double substract(double x, double y);

    double divide(double x, double y) throws DivideByZeroExeption;

    double multiply(double x, double y);
}
