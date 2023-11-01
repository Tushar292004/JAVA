class Amstrong {
    int number;

    public Amstrong(int number) {
        this.number = number;
    }

    public void check() {
        int original = number;
        int remainder;
        int result = 0;
        while (original != 0) {
            remainder = original % 10;
            result += Math.pow(remainder, 3);
            original /= 10;
        }

        if (result == number) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

public class armstrong_para {
    public static void main(String[] args) {
        Amstrong a = new Amstrong(153);
        a.check();
    }
}