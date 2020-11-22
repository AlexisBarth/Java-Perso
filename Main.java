public class Main {
    int x = 5;
    int y = 6;
    String name = "toutou";
  
    public static void main(String[] args) {
      Main myObj = new Main();
      System.out.println(myObj.name);
    }



    public static void authentification() {
        String userName = "";
        String passWord = "";
        authentification Auth = new authentification();

        Scanner input = new Scanner(System.in);

       
        System.out.println("Enter username:");
        Auth.userName = input.nextLine();
        System.out.println("Enter password:");
        Auth.passWord = input.nextLine();
        System.out.println("***************");
        System.out.println("Name: " + Auth.userName);
        System.out.println("Password: " + Auth.passWord);
        
    }
}


