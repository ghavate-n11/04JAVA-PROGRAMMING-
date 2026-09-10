package PracticaL22;

// 1. Creating a thread by extending Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread class running: " + i);
            try {
                Thread.sleep(500); // 500 ms delay
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

// 2. Creating a thread by implementing Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable interface running: " + i);
            try {
                Thread.sleep(500); // 500 ms delay
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {

        // Starting thread created using Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Starting thread created using Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}
