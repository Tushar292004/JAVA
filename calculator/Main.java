package calculator;

class Calculator {

    public static int add(int num1, int num2){
        return num1 + num2 ;
    }

    public static int subract(int num1, int num2){
        return num1 - num2 ;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2 ;
    }

    public static int divide(int num1, int num2){
        if (num2 == 0) {
            throw new ArithmeticException("Not Possible");
        }
        else {
            return num1 / num2 ;
        } 
    }

}

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