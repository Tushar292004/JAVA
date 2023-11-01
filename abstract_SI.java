
abstract class SimpleInterest {
    double time ;
    double rate ;
    double amount ;
    
    public SimpleInterest( double time, double rate, double amount) {
        this.time = time; 
        this.rate = rate;
        this.amount = amount;
    }
    
    public abstract double calculate();
}

class Interest extends SimpleInterest {
    public Interest (double time, double rate, double amount ){
        super(time, rate, amount);
    }
    
    public double calculate(){
        return (time*rate*amount)/100 ;
    }
}

public class abstract_SI {
   public static void main (String[] args) {
        Interest n1 = new Interest(1000, 10, 10);
    double result = n1.calculate();
    System.out.println(result);
   }
}