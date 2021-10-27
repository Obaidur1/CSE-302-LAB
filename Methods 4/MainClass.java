public class MainClass {

  public static void main(String[] args) {
    Student st1 = new Student();
    Student st2 = new Student();
    Student st3 = new Student();
    st1.setInfo("Obaidur", 12, "FEC");
    st2.setInfo("Rahman", 11);
    st3.setInfo("Ovi", 22, "FEC");

    st1.getInfo();
    st2.getInfo();
    st3.getInfo();
  }
}
