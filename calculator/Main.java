package calculator;
public class Main {
    public static void main(String[] args) {

        int resultAdd = Calculator.add(5, 3);
        System.out.println("5 + 3 = " + resultAdd);

        int resultSub = Calculator.subract(5, 3);
        System.out.println("5 - 3 = " + resultSub);

        int resultMul = Calculator.multiply(5, 3);
        System.out.println("5 x 3 = " + resultMul);

        int resultDiv = Calculator.divide(5, 3);
        System.out.println("5 / 3 = " + resultDiv);
    }
}