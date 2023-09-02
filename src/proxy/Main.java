package proxy;

public class Main {
    public static void main(String[] args) {
        ICalculator calculator = new Calculator_Proxy();
       double result =  calculator.division(1,0);
        System.out.println(result);
    }
}
