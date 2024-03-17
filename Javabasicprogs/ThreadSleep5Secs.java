package Start1;

public class ThreadSleep5Secs extends Thread{
	public void run() {
		Thread t = new Thread();
		t.setName("Hari's Thread");
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(5000);
			}catch(InterruptedException ex) {
				System.out.println(ex);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadSleep5Secs t1 = new ThreadSleep5Secs();
		ThreadSleep5Secs t2 = new ThreadSleep5Secs();
		t1.start();
		t2.start();
	}
}
