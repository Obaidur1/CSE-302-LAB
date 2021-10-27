public class MainClass {

  public static void main(String[] args) {
    Child sc = new Child();
    sc.i = 5;
    sc.j = 6;
    sc.j = sc.i;
    sc.printNum();
  }
}
