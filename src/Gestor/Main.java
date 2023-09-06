package Gestor;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Registros registros = new Registros();
        registros.perfil=new Usuario();
        registros.salary=256;
        registros.registerData();
        //usuario.printData();
        registros.perfil.printData();
    }
}