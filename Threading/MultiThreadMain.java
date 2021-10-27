public class MultiThreadMain {

  public static void main(String[] args) {
    Thread nThread = Thread.currentThread();
    System.out.println("Name of thread: " + nThread);

    MultiThread mt = new MultiThread("Hello Java");
    Thread t1 = new Thread(mt);
    Thread t2 = new Thread(mt);
    Thread t3 = new Thread(mt);
    t1.start();
    t2.start();
    t3.start();

    int count = Thread.activeCount();
    System.out.println("No of active threads: " + count);
  }
}
