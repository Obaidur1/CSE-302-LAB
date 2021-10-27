import java.lang.*;

public class ThreadSleep implements Runnable {

  Thread t;

  public void run() {
    for (int i = 10; i < 13; i++) {
      System.out.println(Thread.currentThread().getName() + "  " + i);
      try {
        // thread to sleep for 1000 milliseconds
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}
