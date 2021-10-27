public class NullPointerException {

  public static void main(String[] args) {
    String name = "Obaidur";
    List<String> college = NULL;
    try{
        NullCheck(name,college,name);
    }
    catch(NullPointerException e){
        System.out.println(e);
    }
    
  }
}

public static void NullCheck(String name,List<String> list,String name2){
    System.out.println(name.length()+list.size()+name2.length());
}
