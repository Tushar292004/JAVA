
public class default_constructor {
    int a, b;
    default_constructor() {
        a = 10;
        b = 10;
        System.out.println("Sum of 2 no is " + (a + b));
    }
}

class Main {
    public static void main(String[] args) {
        new default_constructor(); 
    }
}
