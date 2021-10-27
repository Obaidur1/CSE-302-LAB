public class MultiThread implements Runnable {

  String task;

  MultiThread(String task) {
    this.task = task;
  }

  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(task + ":" + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
