// array 1 ,class and object 2,constructor 1
import java.util.Scanner;

public class BasicIO {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String myString;
    char myChar;
    int myInt;
    float myFloat;
    double myDouble;
    System.out.println("Enter a String:");
    myString = sc.nextLine();
    System.out.println("Enter a Character:");
    myChar = sc.next().charAt(0);
    System.out.println("Enter an Integer:");
    myInt = sc.nextInt();
    System.out.println("Enter a Float:");
    myFloat = sc.nextFloat();
    System.out.println("Enter an Double:");
    myDouble = sc.nextDouble();

    System.out.println("String is:" + myString);
    System.out.println("Character is:" + myChar);
    System.out.println("Integer is:" + myInt);
    System.out.println("Float is:" + myFloat);
    System.out.println("Double is:" + myDouble);
  }
}
