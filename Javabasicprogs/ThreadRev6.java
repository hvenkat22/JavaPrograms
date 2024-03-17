package Start1;

public class ThreadRev6 extends Thread{
		public void run() {
			Thread t = new Thread();
			t.setName("Hari's Thread");
			for(int i=5;i>0;i--) {
				try {
					Thread.sleep(6000);
				}catch(InterruptedException ex) {
					System.out.println(ex);
				}
				System.out.println(i);
			}
		}
		public static void main(String[] args) {
			ThreadRev6 t1 = new ThreadRev6();
			ThreadRev6 t2 = new ThreadRev6();
			t1.start();
			t2.start();
		}
}
