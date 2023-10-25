import java.io.*;
import java.util.Scanner;

abstract class bank {
    abstract void roi();

    double bal, interest;
    long accountno;
    Scanner i = new Scanner(System.in);

    void getaccountno() {
        System.out.println("\nEnter the account number");
        accountno = i.nextLong();
        System.out.println("\nEnter the account balance");
        bal = i.nextDouble();
    }

    void printaccdetails() {
        roi();
        System.out.println("Account no:" + accountno);
        System.out.println("Interest Rate:" + interest);
        System.out.println("Balance after interest:" + bal);
    }
}

class Bank1 extends bank {
    void roi() {
        interest = 0.07;
        bal = (bal + (bal * interest));
    }
}

class Bank2 extends bank {
    void roi() {
        interest = 0.06;
        bal = (bal + (bal * interest));
    }
}

class abstract_class {
    public static void main(String args[]) {
        Bank1 acc1 = new Bank1();
        Bank2 acc2 = new Bank2();
        acc1.getaccountno();
        acc1.printaccdetails();
        acc2.getaccountno();
        acc2.printaccdetails();
    }
}
