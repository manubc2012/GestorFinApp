package Gestor;

import java.util.Scanner;

public class Registros {

    Usuario usuario = new Usuario();
    Scanner sc= new Scanner(System.in);

    double salary;
    double incomings;
    double bills;
    double saves;
    Usuario perfil;

    public void registerData(){
        System.out.println(salary);
        System.out.println("Ingrese su nombre");
        perfil.name= sc.next();
    }
}
