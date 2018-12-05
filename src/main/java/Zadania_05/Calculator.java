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
    public double divide(double x, double y) {
        double temp = -1;
        try {
            if(x==0 || y==0){
                throw new DivideByZeroExeption();
            }else{
                temp=x/y;
            }
        } catch (DivideByZeroExeption e) {
            System.out.println("Nie dziel przez 0!!!");
        }
        return temp;
    }

    @Override
    public double multiply(double x, double y) {
        return x * y;
    }
}
