import java.io.*;
import java.util.Scanner;

class exception_handling  {
    public static void main(String args[]) {
        try {
            int select;
            Scanner i = new Scanner(System.in);
            System.out.println("\nEnter the Exception to be Handled");
            System.out.println("\n1.ArrayIndexOutOfBoundsException\n2.ArithmeticException");
            System.out.println("3.NullException");
            select = i.nextInt();
            switch (select) {
                case 1:// ArrayIndexOutOfBoundsException
                    int a[] = new int[2];
                    System.out.println("Access element three :" + a[3]);
                    break;
                case 2:// ArithmeticException
                    int num1 = 30, num2 = 0;
                    int output = num1 / num2;
                    System.out.println("Result = " + output);
                    break;
                case 3:// NullPointerException
                    String str = null;
                    System.out.println(str.length());
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } catch (ArithmeticException e1) {
            System.out.println("Exception thrown  :" + e1);
        } catch (NullPointerException e2) {
            System.out.println("Exception thrown :" + e2);
        }
        System.out.println("Out of the block");
    }
}
