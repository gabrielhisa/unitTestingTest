package calculator;

public class SimpleCalculator {

    public SimpleCalculator(){

    }

    public int add(int a, int b){
        return a + b;
    }

    public double divive(int dividend, int divisor){
        if (divisor == 0){
            throw new IllegalArgumentException("Cannot divide by 0.");
        }
        return (double) dividend / divisor;
    }

    public boolean isEven(int n){
        return n % 2 == 0;
    }


}
