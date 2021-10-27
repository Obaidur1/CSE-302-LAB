public class Degree {

  void getDegree() {
    System.out.println("I got a degree");
  }
}

class Undergraduate extends Degree {

  void getDegree() {
    System.out.println("I am an Undergraduate");
  }
}

class Postgraduate extends Degree {

  void getDegree() {
    System.out.println("I am a Postgraduate");
  }
}
