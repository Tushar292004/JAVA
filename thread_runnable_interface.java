class FirstThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Message from First Thread : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("First Thread is interrupted when it is sleeping" + e);
            }
        }
    }
}

class SecondThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Message from Second Thread : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Second Thread is interrupted when it is sleeping" + e);
            }
        }
    }
}

class ThreadDemo {
 public static void main(String args[]){
        FirstThread   firstThread = new FirstThread();
        SecondThread   secondThread = new SecondThread();
        Thread thread1 = new Thread(firstThread);
        thread1.start();
        Thread thread2 = new Thread(secondThread);
        thread2.start();
                }       
}
