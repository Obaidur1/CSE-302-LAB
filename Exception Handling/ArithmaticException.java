public class ArithmaticException {

  public static void main(String[] args) {
    int a = 0, b = 10, c = 0;
    try {
      c = b / a;
    } catch (ArithmeticException e) {
      System.out.println(
        "We are just printing the stack trace.\n" +
        "ArithmeticException is handled. But take care of the variable \"c\""
      );
    }
  }
}
