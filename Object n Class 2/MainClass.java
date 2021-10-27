import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Students student = new Students("Obaidur", 2630);
    System.out.println("Name: " + student.name);
    System.out.println("Roll: " + student.roll_no);
  }
}
