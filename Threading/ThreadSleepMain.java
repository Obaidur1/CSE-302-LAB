import java.lang.*;

public class ThreadSleepMain {

  public static void main(String[] args) throws Exception {
    Thread t = new Thread(new ThreadSleep());

    t.start();
    Thread t2 = new Thread(new ThreadSleep());
    t2.start();
  }
}
