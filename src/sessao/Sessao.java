package sessao;

import dadosFichaRegisto.FichaRegisto;
import dadosFichaRegisto.Professor;
import dadosFichaRegisto.unidadeCurricular;
import secretariado.*;
import database.*;

import java.util.Scanner;

public class Sessao {

public Sessao(String[] args) {

    String Username;
    String Password;

    Password = "123";
    Username = "wisdom";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {

        System.out.println("Access Granted! Welcome!");
    }

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }

}

}