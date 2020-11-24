public class Main {
    int x = 5;
    int y = 6;
    String name = "toutou";
  
    public static void main(String[] args) {
      User myObj = new User();
      System.out.println(myObj.name);

      myObj.login();
      myObj.viewSettings();
    }




}


