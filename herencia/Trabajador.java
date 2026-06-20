public class Trabajador extends Persona {
    private String ncargo;

    public Trabajador() {
    }

    public Trabajador(String ci, String nombre, String ncargo) {
        super(ci, nombre);
        this.ncargo = ncargo;
    }

    public String datosTrabajador() {
        return "CI: " + getCi() + " Nombre: " + getNombre() + " Cargo: " + ncargo;
    }

    public String getNcargo() {
        return ncargo;
    }

    public void setNcargo(String ncargo) {
        this.ncargo = ncargo;
    }
}
