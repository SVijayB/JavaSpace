package Threads;

public class threads implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
        System.out.println("End of " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        threads obj = new threads();
		Thread a = new Thread(obj);
		Thread b = new Thread(obj);
		Thread c = new Thread(obj);
		a.setPriority(Thread.MIN_PRIORITY);
		b.setPriority(a.getPriority());
		c.setPriority(Thread.MAX_PRIORITY);
		a.start();
		b.start();
		c.start();
	}
}