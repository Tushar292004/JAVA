package user_defined_exception;

class Sample {
    public static void main(String args[]) throws Exception {
        Sample es = new Sample();
        es.displayMymsg();
    }

    public void displayMymsg() throws MyException {
        for (int j = 8; j > 0; j--) {
            System.out.println("j= " + j);
            if (j == 7)
                throw new MyException("This is my own Custom Message");
        }
    }
}
