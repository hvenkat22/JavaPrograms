package Start1;

class UserThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000); 
            System.out.println("User Thread is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class MultiThreadUser {
    public static void main(String[] args) {
        UserThread userThread = new UserThread();
        userThread.start(); 
        try {
            Thread.sleep(1000); 
            System.out.println("Main Thread is running");
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        try {
            userThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Both threads have completed.");
    }
}

