import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndexOutOfBound {

  public static void main(String[] args) {
    int[] myArray = { 12, 45, 32, 65, 98, 45 };
    System.out.println("Elements in the Array:" + Arrays.toString(myArray));
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the index of the required element :");
    try {
      int ind = sc.nextInt();
      System.out.println("Element in the given index is:" + myArray[ind]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error!");
    }
  }
}
