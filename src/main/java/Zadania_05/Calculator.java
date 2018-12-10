package Zadania_05;

public class Calculator implements Calculate {

    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double substract(double x, double y) {
        return x - y;
    }

    @Override
    public double divide(double x, double y) throws DivideByZeroExeption {
        if(y==0){
            throw new DivideByZeroExeption("Nie dziel przez 0!");
        }
        return x/y;
    }

    @Override
    public double multiply(double x, double y) {
        return x * y;
    }
}
