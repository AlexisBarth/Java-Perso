
import java.util.Scanner; // Import Scanner Class
import java.io.File;
import java.io.FileNotFoundException;


public class User {
    //Attributs
    String name;
    int age;
    String mail;
    int role;
    boolean isLogged;
    String password;



    //Constructeur
    public User() {
    name = "name";
    age = 30;
    mail = "aa@bb.cc";
    role = 2;
    isLogged = false;
    password = "pass";
    }


    //Methodes

    // Vérifie la concordance entre les noms est pass entrés et sotckés
    // renvoi un message de connection et change le status connecté en true
    // renvoi un message d'erreur le cas échéan

    public void login() {
        String userName = "";
        String passWord = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        userName = input.nextLine();
        System.out.println("Enter password:");
        passWord = input.nextLine();

        if (userName.equals(name) && passWord.equals(password)) {
            System.out.println("You are logged in");
            isLogged = true;
        } else 
        {
            System.out.println("Your are not logged in");
        }
        
    } 


    public void viewSettings() {
        //lit le fichier Setting.txt
        try {
            File objFile = new File ("Settings.txt");
            Scanner myReader = new Scanner (objFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Reading File");
            e.printStackTrace();
        }

    }
}