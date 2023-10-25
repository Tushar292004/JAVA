import java.util.Scanner;

public class class_object {
     void fact() {
        int fact = 1, n, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial of that number");
        n = s.nextInt();
        for (i = 1; i <= n; i++)
            fact = fact * i;
        System.out.println("The factorial of a given number " + n + " is " + fact);
    }
}

class Main {
    public static void main(String[] args) {
        class_object f = new class_object();
        f.fact();
    }
}

//javac class_object.java
//java Main
