package Start1;
class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Thread " + getName() + " is running with priority " + getPriority());
    }
}
public class SetThreadPriority {
    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread("Thread 1");
        PriorityThread thread2 = new PriorityThread("Thread 2");
        PriorityThread thread3 = new PriorityThread("Thread 3");
        PriorityThread thread4 = new PriorityThread("Thread 4");
        PriorityThread thread5 = new PriorityThread("Thread 5");

        thread1.setPriority(1);
        thread2.setPriority(5);
        thread3.setPriority(3);
        thread4.setPriority(7);
        thread5.setPriority(9);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
