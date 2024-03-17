package Start1;

class Printer {
    private int currentJob = 1;
    public synchronized void print(int jobNumber) {
        while (jobNumber != currentJob) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Printing Job " + jobNumber);
        currentJob++;
        notifyAll(); 
    }
}
public class PrinterProblem {
    public static void main(String[] args) {
        int totalJobs = 10;
        Printer printer = new Printer();
        for (int i = 1; i <= totalJobs; i++) {
            int jobNumber = i;
            Thread jobThread = new Thread(new Runnable() {
                public void run() {
                    printer.print(jobNumber);
                }
            });
            jobThread.start();
        }
    }
}
