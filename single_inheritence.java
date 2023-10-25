class Employee {
    public void displayEmp(){
        System.out.println("Employee Name : Rajesh");
    }
}

class Salary extends Employee{
    public void displaySalary(){
        System.out.println("The Salary Is $1200");
    }
}

public class single_inheritence {
    public static void main(String[] args) {
        Salary s = new Salary();
        s.displayEmp();
        s.displaySalary();
    }
}

