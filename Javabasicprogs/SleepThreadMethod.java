package Start1;
class SleepThread extends Thread {
    private long sleepTime;
    public SleepThread(String name, int sleep) {
        super(name);
        sleepTime = sleep;
    }
    public void run() {
        try {
            System.out.println("Thread " + getName() + " is running.");
            Thread.sleep(sleepTime); 
            System.out.println("Thread " + getName() + " has finished sleeping.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class SleepThreadMethod {
    public static void main(String[] args) {
        Thread threadA = new SleepThread("ThreadA", 10); 
        Thread threadB = new SleepThread("ThreadB", 20);  
        Thread threadC = new SleepThread("ThreadC", 50);   
        Thread threadD = new SleepThread("ThreadD", 70);   
        Thread threadE = new SleepThread("ThreadE", 100); 
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
    }
}


