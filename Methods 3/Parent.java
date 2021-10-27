public class Parent {

  int i;

  void printNum() {
    System.out.println("Value of i: " + i);
  }
}

class Child extends Parent {

  int j;

  void printNum() {
    System.out.println("Value of j: " + j);
  }
}
