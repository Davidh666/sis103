public class Consultor extends Persona {
    private int htrabajadas;

    public Consultor() {
    }

    public Consultor(String ci, String nombre, int htrabajadas) {
        super(ci, nombre);
        this.htrabajadas = htrabajadas;
    }

    public String datosConsultor() {
        return "CI: " + getCi() + " Nombre: " + getNombre() + " Horas trabajadas: " + htrabajadas;
    }

    public int getHtrabajadas() {
        return htrabajadas;
    }

    public void setHtrabajadas(int htrabajadas) {
        this.htrabajadas = htrabajadas;
    }
}
