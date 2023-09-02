package proxy;

public class Calculator_Proxy implements ICalculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double division(double a, double b) {
        if(b == 0){
            throw new RuntimeException("Can not divided by 0");

        }
        return a / b;
    }
}
