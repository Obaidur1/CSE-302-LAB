public class NumberFormat {

  public static void main(String[] args) {
    String myString = "12.55";
    try {
      int number = Integer.parseInt(myString);
    } catch (NumberFormatException e) {
      System.err.println("Invalid String Argument!");
    }
  }
}
