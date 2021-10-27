public class Student {

  String name, address;
  int age;

  Student() {
    System.out.println("Unknown");
    System.out.println('0');
    System.out.println("Not Available");
  }

  void setInfo(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void setInfo(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  void getInfo() {
    System.out.println(name);
    System.out.println(age);
    System.out.println(address);
  }
}
