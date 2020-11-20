
import java.util.Scanner; // Import Scanner Class

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
    name = "A";
    age = 30;
    mail = "aa@bb.cc";
    role = 1;
    isLogged = false;
    password = "B";
    }


    //Methodes

    //Vérifie la concordance entre les noms est pass entrés et sotckés
    //renvoi un message de connection et change le status conencté en true
    //renvoi un message d'erreur le cas échéan
    public void login( String _name, String _password) {
        if (name.equals(_name) && passWord.equals(_password)) {
            System.out.println("You are logged in");
            User.islogged = true;
        } else 
        {
            System.out.println("Your are not logged in");
        }
    }

    public void viewSettings() {
        //lit le fichier Setting.txt
    }
    public static void main(String[] args) {
        User user1 = new User();


        




    }
}