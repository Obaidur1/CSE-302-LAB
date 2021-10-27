import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Results results = new Results();
    System.out.println("How many elements ?");
    int elements = sc.nextInt();
    int[] myArray = new int[elements];
    System.out.println("Enter the elements?:");
    for (int i = 0; i < elements; i++) {
      myArray[i] = sc.nextInt();
    }
    results.sum(myArray, elements);
    results.average(myArray, elements);
    results.smallestElem(myArray, elements);
    results.largestElem(myArray, elements);
    results.primeNumbers(myArray, elements);
    results.reverseElem(myArray, elements);
    results.ascendingOrder(myArray, elements);
  }
}
