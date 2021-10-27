public class ThreadFunda {

  public static void main(String[] args) {
    ThreadClass threadClass = new ThreadClass();
    threadClass.start();
    threadClass.setName("My thread class");
    System.out.println("Thread name:" + threadClass.getName());
    System.out.println("Thread ID:" + threadClass.getId());
    System.out.println("Thread Priority:" + threadClass.getPriority());
    threadClass.setPriority(9);
    threadClass.sleep(2000);
    System.out.println("Thread Priority:" + threadClass.getPriority());
  }
}
