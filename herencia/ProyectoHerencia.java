import java.util.Scanner;

public class ProyectoHerencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String ci, nombre;
        int ht;

        ci = leer.nextLine();
        nombre = leer.nextLine();
        ht = leer.nextInt();

        Persona persona1 = new Persona(ci, nombre);
        Trabajador trabajador1 = new Trabajador(ci, nombre, "Programador");
        Consultor consultor1 = new Consultor(ci, nombre, ht);

        System.out.println(persona1.datosPersona());
        System.out.println(trabajador1.datosTrabajador());
        System.out.println(consultor1.datosConsultor());
    }
}