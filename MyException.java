public class MyException extends Exception {
 public MyException(String mymsg)  {
 super(mymsg);
 }
}

class Sample {
    public static void main(String args[]) throws Exception {
        Sample es = new Sample();
        es.displayMymsg();
    }

    public void displayMymsg() throws MyException {
        for (int j = 1; j < 5; j++) {
            System.out.println("j= " + j);
            if (j == 3)
                throw new MyException("This is my own Custom Message");
        }
    }
}
